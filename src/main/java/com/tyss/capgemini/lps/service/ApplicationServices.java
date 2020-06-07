package com.tyss.capgemini.lps.service;

import java.util.List;

import com.tyss.capgemini.lps.beans.ApplicationBean;
import com.tyss.capgemini.lps.beans.CustomerBean;

public interface ApplicationServices {
	public boolean addApplication(CustomerBean customerBean);

	public List<ApplicationBean> viewApplication();

	public boolean updateApplicationStatus(int appId, String status);

	public ApplicationBean getAllApplication(String loanType);
	
	public boolean makeLoan(ApplicationBean applicationBean);
	
	public boolean applicantLoanDetails(String userName, String password);
} // End of interface
