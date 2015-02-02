package com.cloudzon.huddle.exception;

public class TokenHasExpiredException extends BaseWebApplicationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TokenHasExpiredException() {
		super(403, "40302", "Token has expired",
				"An attempt was made to load a token that has expired");
	}
}
