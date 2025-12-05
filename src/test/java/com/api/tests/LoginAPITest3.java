package com.api.tests;

import org.testng.annotations.Test;
import com.api.base.AuthService;
import io.restassured.response.Response;

public class LoginAPITest3 {
	@Test(description = "Verify if the Login API is working")
	public void loginTest() {
		AuthService authService = new AuthService();
		Response response = authService.login("{\"username\": \"uday1234\",\"password\": \"uday1234\"}");
		System.out.println(response.asPrettyString());
	}

}

/*
 * >>	Service Object Model: In API We use SOM as like we use in UI POM(page object model).
 * >>	The way we design this login test we can only run any method independently instead of run all the test.
 * >>	The purpose of SOM is handle the business logic and the application rules.
 */