package com.juaracoding.ujian.duaempatdesember.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class DriverSingleton {
	public static DriverSingleton instance = null;
	private static WebDriver driver;
	
	public DriverSingleton() {
		intantiate("chrome");
	}
	
	public WebDriver intantiate(String strategy) {
		DriverStrategy driverStrategy = DriverStratefyImplementor.chooseStrategy(strategy);
		driver = driverStrategy.setStrategy();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	
	public static DriverSingleton getInstance() {
		if(instance==null) {
			instance = new DriverSingleton();
		}
		return instance;
	}
	
	public static void closeObjectInstance() {
		instance = null;
		driver.quit();
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}
