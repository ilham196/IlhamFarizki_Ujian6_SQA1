Feature: Shop Tools Website

Scenario: Register the authorization
	Given User go to Website
	When User click My Account page button
	And User input username email address password and click Register
	Then User now can login to the website