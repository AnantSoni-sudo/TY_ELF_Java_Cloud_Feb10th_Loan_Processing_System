package com.tyss.capgemini.lps.exception;

public class UserNotFoundException extends Exception{
private static final long serialVersionUID = 1L;
	
	String msg;

	public UserNotFoundException() {

	}
	
	public UserNotFoundException(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	} // End of getMsg()

	public void setMsg(String msg) {
		this.msg = msg;
	} // End of setMsg()

} // End of class
