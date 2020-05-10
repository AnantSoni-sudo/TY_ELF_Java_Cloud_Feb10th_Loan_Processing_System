package com.tyss.capgemini.lps.service;

import com.tyss.capgemini.lps.DAO.LoanDAO;
import com.tyss.capgemini.lps.beans.ApplicationBean;
import com.tyss.capgemini.lps.beans.LoanBean;
import com.tyss.capgemini.lps.factory.FactoryDAO;
import com.tyss.capgemini.lps.repository.LoanProgRepository;

public class LoanServicesImpl implements LoanServices {
	private LoanDAO dao = FactoryDAO.getLoanDAO();

	@Override
	public boolean addLoanInformation(LoanBean loanBean) {
		return dao.addLoanInformation(loanBean);
	}

	@Override
	public boolean deleteLoanInformation(String bankName) {
		return dao.deleteLoanInformation(bankName);
	}

	@Override
	public LoanProgRepository getLoanPrograms() {
		return dao.getloanPrograms();
	}


}
