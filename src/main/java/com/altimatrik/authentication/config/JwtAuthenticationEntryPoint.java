package com.altimatrik.authentication.config;

import java.io.IOException;
import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

/**
 * The Class JwtAuthenticationEntryPoint extends AuthenticationEntryPoint class
 * and override its method to commence. It rejects every unauthenticated request
 * and sends error code 401.
 */
@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint, Serializable {

	private static final long serialVersionUID = -3580758811513632139L;

	/**
	 * Commence.
	 *
	 * @param request the request
	 * @param response the response
	 * @param authException the auth exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException authException) throws IOException {
		response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
	}

}
