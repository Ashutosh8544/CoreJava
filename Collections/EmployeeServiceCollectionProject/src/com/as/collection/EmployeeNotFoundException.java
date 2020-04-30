package com.as.collection;

public class EmployeeNotFoundException extends Exception {
	public EmployeeNotFoundException() {
		super();
	}
	public EmployeeNotFoundException(String errMsg) {
		super(errMsg);
	}
}
