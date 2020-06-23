package com.altimatrik.authentication.model;

import java.io.Serializable;

/**
 * The Class JwtRequest.
 */
public class JwtRequest implements Serializable {

	
	private static final long serialVersionUID = -7205422105395222714L;
	
	private String username;
	private String password;


	/**
	 * Instantiates a new jwt request.
	 * need default constructor for JSON Parsing
	 */
	public JwtRequest() {
	}

	public JwtRequest(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
