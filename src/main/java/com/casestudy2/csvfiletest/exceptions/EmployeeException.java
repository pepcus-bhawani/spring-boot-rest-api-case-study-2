package com.casestudy2.csvfiletest.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeException extends RuntimeException {

	String message;
}
