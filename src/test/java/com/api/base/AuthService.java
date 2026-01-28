package com.api.base;

import java.util.HashMap;
import com.api.models.request.LoginRequest;
import com.api.models.request.SignUpRequest;
import io.restassured.response.Response;

public class AuthService extends BaseService {
	private static final String BASE_PATH = "/api/auth/";

	/* We created POJO class for the payload. */
	public Response login(LoginRequest payload) {
		return postRequest(payload, BASE_PATH + "login");
	}

	public Response signUp(SignUpRequest payload) {
		return postRequest(payload, BASE_PATH + "signup");
	}

	/* For a single entity of payload do not need to create a POJO class. */
	public Response forgotPassword(String emailAddress) {
		HashMap<String, String> payload = new HashMap<>();
		payload.put("email", emailAddress);
		return postRequest(payload, BASE_PATH + "forgot-password");
	}

}