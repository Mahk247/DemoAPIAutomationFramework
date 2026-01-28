package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.api.base.AuthService;
import com.api.base.UserProfileManagmentService;
import com.api.models.request.LoginRequest;
import com.api.models.request.ProfileRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;
import io.restassured.response.Response;

public class UpdateProfileTest {
	@Test
	public void getProfileInfoTest() {
		AuthService authService = new AuthService();
		Response response =authService.login(new LoginRequest("", ""));
		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println(response.asPrettyString());
		
		System.out.println("------------------------------------------------");
		
		UserProfileManagmentService userProfileManagmentService = new UserProfileManagmentService();
		response = userProfileManagmentService.getProfile(loginResponse.getToken());
		System.out.println(response.asPrettyString());
		UserProfileResponse userProfileResponse =response.as(UserProfileResponse.class);
		Assert.assertEquals(userProfileResponse.getUsername(), "");
		
		System.out.println("------------------------------------------------");
		
		ProfileRequest profileRequest = new ProfileRequest.Builder()
				.firstName("Mahmud").lastName("Khan").email("khan@test.com").mobileNumber("2341231234").build();
		
		response = userProfileManagmentService.updateProfile(loginResponse.getToken(), profileRequest);
		System.out.println(response.asPrettyString());
		
	}

}