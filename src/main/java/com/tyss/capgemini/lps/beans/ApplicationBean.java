package com.tyss.capgemini.lps.beans;

import lombok.Data;

@Data
public class ApplicationBean {
	private Integer applicationId;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private Long mobileNumber;
	private String emailId;
	private String status;
	private String loanType;
}// End of class
