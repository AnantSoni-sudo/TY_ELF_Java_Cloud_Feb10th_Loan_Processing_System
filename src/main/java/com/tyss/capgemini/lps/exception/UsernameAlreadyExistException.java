package com.tyss.capgemini.lps.exception;

public class UsernameAlreadyExistException extends RuntimeException {
	String msg = "Username already exist";

	public UsernameAlreadyExistException() {
	}

	public UsernameAlreadyExistException(String msg) {
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return msg;
	}
}
