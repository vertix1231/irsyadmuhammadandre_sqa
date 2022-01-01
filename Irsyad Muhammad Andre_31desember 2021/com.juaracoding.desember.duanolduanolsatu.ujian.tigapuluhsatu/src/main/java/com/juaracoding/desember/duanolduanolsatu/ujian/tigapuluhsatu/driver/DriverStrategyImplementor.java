package com.juaracoding.desember.duanolduanolsatu.ujian.tigapuluhsatu.driver;

import com.juaracoding.desember.duanolduanolsatu.ujian.tigapuluhsatu.utils.ConstantsDriver;

public class DriverStrategyImplementor {
	public static DriverStrategy chooseStrategy(String strategy) {
		switch (strategy) {
		case ConstantsDriver.CHROME:
			return new Chrome();

		case ConstantsDriver.FIREFOX:
			return new FireFox();

		default:
			return null;
		}
	}
}
