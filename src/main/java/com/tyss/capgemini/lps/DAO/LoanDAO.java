package com.tyss.capgemini.lps.DAO;

import com.tyss.capgemini.lps.beans.ApplicationBean;
import com.tyss.capgemini.lps.beans.LoanBean;
import com.tyss.capgemini.lps.repository.LoanProgRepository;

public interface LoanDAO {
	public boolean addLoanInformation(LoanBean loanBean);

	public boolean deleteLoanInformation(String bankName);

	public LoanProgRepository getloanPrograms();
	
} // End of interface
