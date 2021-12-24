package com.juaracoding.ujian.duaempatdesember.driver;

public class DriverStrategyImplementor {

	public static DriverStrategy chooseStrategy(String strategy) {
		
		switch (strategy) {
		case "chrome":
			return new Chrome();
		
		case "firefox":
			return new FireFox();

		default:
			return null;
		}
	}
}
