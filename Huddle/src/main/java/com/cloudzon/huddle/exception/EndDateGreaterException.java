package com.cloudzon.huddle.exception;

public class EndDateGreaterException extends BaseWebApplicationException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EndDateGreaterException() {
		super(409, "409014", "Enddate must be greater than start date",
				"Enddate must be greater than start date");
	}
}
