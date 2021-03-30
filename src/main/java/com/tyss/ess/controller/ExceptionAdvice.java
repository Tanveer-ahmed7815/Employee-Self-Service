package com.tyss.ess.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.tyss.ess.dto.ExceptionMessage;
import com.tyss.ess.exception.ServiceException;

@ControllerAdvice
public class ExceptionAdvice {

	@ExceptionHandler(ServiceException.class)
	public ResponseEntity<ExceptionMessage> mapException(ServiceException serviceException) {
		ExceptionMessage exceptionMessage2 = new ExceptionMessage(HttpStatus.INTERNAL_SERVER_ERROR.value(),
				serviceException.getMessage());
		return new ResponseEntity<ExceptionMessage>(exceptionMessage2, HttpStatus.INTERNAL_SERVER_ERROR);

	}
}
