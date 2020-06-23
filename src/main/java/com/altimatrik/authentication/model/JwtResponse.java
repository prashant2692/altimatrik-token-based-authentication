package com.altimatrik.authentication.model;

import java.io.Serializable;

/**
 * The Class JwtResponse.
 */
public class JwtResponse implements Serializable {

	private static final long serialVersionUID = 8257121604740290621L;

	private final String jwttoken;

	public JwtResponse(String jwttoken) {
		this.jwttoken = jwttoken;
	}

	public String getToken() {
		return this.jwttoken;
	}
}
