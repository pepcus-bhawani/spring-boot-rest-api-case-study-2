package com.casestudy2.csvfiletest.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AttendanceException extends RuntimeException {

	String message;
	
}
