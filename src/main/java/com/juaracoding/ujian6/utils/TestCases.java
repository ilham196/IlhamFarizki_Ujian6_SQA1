package com.juaracoding.ujian6.utils;

public enum TestCases {
	
	T1("Register the authorization"),
	T2("Testing the authentication"),
	T3("Testing Add to Cart menu"),
	T4("Testing Proceed to Checkout");
	
	private String testName;
	private TestCases(String value) {
		this.testName = value;
	}
	
	public String getTestName() {
		return testName;
	}

}
