package com.tyss.ess.exception;

import lombok.Data;

@Data
public class ServiceException extends Exception {


	private static final long serialVersionUID = 1L;
	private final int  statusCode;

	public ServiceException(String message, int statusCode) {
		super(message);
		this.statusCode = statusCode;
	}

}
