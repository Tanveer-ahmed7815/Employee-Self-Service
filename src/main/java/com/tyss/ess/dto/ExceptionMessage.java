package com.tyss.ess.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor 
public class ExceptionMessage {

	private int errorCode;
	private String errorMessage;
	
}
