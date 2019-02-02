package com.orastays.testimonialserver.exceptions;

public class MailSendException extends Exception {

	private static final long serialVersionUID = -4277601009226665335L;
	private String name;

	public MailSendException(String name) {
		super(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}