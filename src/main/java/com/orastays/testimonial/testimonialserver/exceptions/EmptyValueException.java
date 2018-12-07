package com.orastays.testimonial.testimonialserver.exceptions;

public class EmptyValueException extends Exception {

	private static final long serialVersionUID = 8247932791321314098L;
	private String name;

	public EmptyValueException(String name) {
		super(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}