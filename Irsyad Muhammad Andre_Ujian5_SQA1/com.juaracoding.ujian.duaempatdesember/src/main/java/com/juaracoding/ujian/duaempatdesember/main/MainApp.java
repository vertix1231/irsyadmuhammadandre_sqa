package com.juaracoding.ujian.duaempatdesember.main;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.juaracoding.ujian.duaempatdesember.automationpractice.account.CreateAccountClass;
import com.juaracoding.ujian.duaempatdesember.automationpractice.addchart.AddtoChartClass;
import com.juaracoding.ujian.duaempatdesember.automationpractice.checkout.CheckoutClass;
import com.juaracoding.ujian.duaempatdesember.driver.DriverSingleton;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = DriverSingleton.getInstance().getDriver();
		driver.get("http://automationpractice.com/");
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,10)");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		

		CreateAccountClass accountClass = new CreateAccountClass();
		AddtoChartClass addtoChartClass = new AddtoChartClass();
		CheckoutClass checkoutClass = new CheckoutClass();

		//sign in button home
		accountClass.SinginOrRegisterElement();
		
//		//register
//		accountClass.registerAccount("irsyad.muhamad.andre@gmail.com","12345");
		
		//login
		accountClass.loginAccount("irsyad.muhamad.andre@gmail.com","12345");
		addtoChartClass.buyDress();
		addtoChartClass.buyTshirt();
		
		checkoutClass.CekidotYukBelanjaan();
		
	
		
		
		

	}

}
