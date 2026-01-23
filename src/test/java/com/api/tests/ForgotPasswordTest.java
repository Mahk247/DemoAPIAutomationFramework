package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import io.restassured.response.Response;

public class ForgotPasswordTest {
	@Test(description = "Verify if the Login API is working")
	public void forgotPasswordTest() {
		AuthService authService = new AuthService();
		Response response =authService.forgotPassword("khan@test.com");
		System.out.println(response.asPrettyString());
	}
	
}