package com.api.tests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.specification.RequestSpecification;

public class TestingTest {
	static final String BASE_URL = "http://64.227.160.186:8080";
	static RequestSpecification requestSpecification;

	public TestingTest() {
		requestSpecification = given().baseUri(BASE_URL);

	}

	@Test
	public void Test() {
		TestingTest req = new TestingTest();
		System.out.println(req.requestSpecification);
	}

}
