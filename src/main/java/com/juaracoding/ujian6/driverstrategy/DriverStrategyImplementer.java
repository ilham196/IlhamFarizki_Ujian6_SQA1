package com.juaracoding.ujian6.driverstrategy;

import com.juaracoding.ujian6.utils.Constants;

public class DriverStrategyImplementer {

	public static DriverStrategy chooseStrategy(String strategy) {
		switch (strategy) {
		case Constants.CHROME:
			return new Chrome();

		default:
			return null;
		}
	}

}
