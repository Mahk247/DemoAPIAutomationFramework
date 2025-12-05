package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*; // Using static import to improved readability.
import io.restassured.response.Response;

public class LoginAPITest2 {
	@Test(description = "Verify if the Login API is working")
	public void loginTest() {	//We do not need create an object of RestAssured Class because its Static in nature. This is a utility class
				
		Response response = given().baseUri("http://64.227.160.186:8080/")
				.header("Content-Type", "application/json")
				.body("{\"username\": \"uday1234\",\"password\": \"uday1234\"}")
				.post("/api/auth/login");
		
		System.out.println(response.asPrettyString());
		
		Assert.assertEquals(response.getStatusCode(), 200);
	}

}