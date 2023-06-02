package com.curso.exception;

public class HotelNotFoundException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1064484408553437919L;

	public HotelNotFoundException(String message) {
		
		super(message);
	}
}
