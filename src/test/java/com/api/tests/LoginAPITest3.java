package com.api.tests;

import org.testng.annotations.Test;
import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;

public class LoginAPITest3 {
	@Test(description = "Verify if the Login API is working")
	public void loginTest() {
		LoginRequest loginRequest = new LoginRequest("uday1234", "uday1234");
		
		AuthService authService = new AuthService();
		Response response = authService.login(loginRequest);
		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println(response.asPrettyString());
		System.out.println(loginResponse.getToken());
		
		System.out.println(loginResponse.getEmail());
	}
	/*	Links
	 * 	https://www.youtube.com/watch?v=y6d6yjmQPk4&t=4175s [day 2 1.56mm]
	 *	http://64.227.160.186:8080/swagger-ui/index.html#/kyc-controller
	 *	https://tech-with-jatin.notion.site/E2E-Automation-Framework-Creation-1526d427c22780328b8fff211ee050b7


	/*
	 * >>	Service Object Model: In API We use SOM as like we use in UI POM(page object model).
	 * >>	The way we design this login test we can only run any method independently instead of run all the test.
	 * >>	The purpose of SOM is handle the business logic and the application rules.
	 */
} 