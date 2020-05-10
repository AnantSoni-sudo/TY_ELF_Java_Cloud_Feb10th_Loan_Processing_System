package com.tyss.capgemini.lps.exception;

public class IdExistsException extends Exception {
private static final long serialVersionUID = 1L;
	
	String msg;

	public IdExistsException() {

	}
	
	public IdExistsException(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
