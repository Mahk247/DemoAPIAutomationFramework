package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagmentService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;

public class GetProfileRequestTest {
	
	
	@Test
	public void getProfileInfoTest() {
		AuthService authService = new AuthService();
		Response response = authService.login(new LoginRequest("uday1234", "uday1234"));
		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println(loginResponse.getToken());
		
		UserProfileManagmentService userProfileManagmentService =new UserProfileManagmentService();
		response = userProfileManagmentService.getProfile(loginResponse.getToken());
		System.out.println(response.asPrettyString());
	}

}
