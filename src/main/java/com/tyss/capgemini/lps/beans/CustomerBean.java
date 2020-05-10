package com.tyss.capgemini.lps.beans;

import lombok.Data;

@Data
public class CustomerBean {
	private Integer customerId;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private Integer applicationId;
	private Long mobileNumber;
	private Long loanAccountNo;
	private String emailId;
	private Double accountBalance;
	private Double amountToPay;
	private Double loanAmount;
	private String loanApprovedDate;
	private String loanType;
}//end of CustomerBean
