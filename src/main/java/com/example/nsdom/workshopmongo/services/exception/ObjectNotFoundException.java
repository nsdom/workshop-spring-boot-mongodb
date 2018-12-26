package com.example.nsdom.workshopmongo.services.exception;

import javax.validation.valueextraction.ExtractedValue;

public class ObjectNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String msg) {
		super(msg);
	}
}
