package com.tyss.capgemini.lps.service;

import com.tyss.capgemini.lps.beans.ApplicationBean;
import com.tyss.capgemini.lps.beans.LoanBean;
import com.tyss.capgemini.lps.repository.LoanProgRepository;

public interface LoanServices {
	public boolean addLoanInformation(LoanBean loanBean);

	public boolean deleteLoanInformation(String bankName);

	 public  LoanProgRepository getLoanPrograms();


}
