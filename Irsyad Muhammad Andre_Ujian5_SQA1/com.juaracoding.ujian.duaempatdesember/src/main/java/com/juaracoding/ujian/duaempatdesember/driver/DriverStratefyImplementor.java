package com.juaracoding.ujian.duaempatdesember.driver;

public class DriverStratefyImplementor {

	public static DriverStrategy chooseStrategy(String strategyy) {
		switch (strategyy) {
		case "chrome":
			return new Chrome();

		case "firefox":
			return new FireFox();

		default:
			return null;
		}

	}
}
