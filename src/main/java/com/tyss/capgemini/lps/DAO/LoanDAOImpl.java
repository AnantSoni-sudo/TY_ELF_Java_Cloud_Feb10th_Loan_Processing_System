package com.tyss.capgemini.lps.DAO;

import java.util.List;

import org.apache.log4j.Logger;

import com.tyss.capgemini.lps.beans.ApplicationBean;
//import com.capgemini.banking.beans.UserDetails;
import com.tyss.capgemini.lps.beans.LoanBean;
import com.tyss.capgemini.lps.repository.LoanProcessingSystemDB;
import com.tyss.capgemini.lps.repository.LoanProgRepository;

public class LoanDAOImpl implements LoanDAO {
	Logger log = Logger.getLogger(LoanDAOImpl.class);

	@Override
	public boolean addLoanInformation(LoanBean loanBean) {
		for (LoanBean loanBean1 : LoanProgRepository.ARRAY_LIST) {
			log.info(loanBean);
			return true; // false
		}

		LoanProgRepository.ARRAY_LIST.add(loanBean);
		return false; // true
	} // End of addLoanInformation()

	@Override
	public boolean deleteLoanInformation(String bankName) {
		for (int i = 0; i < LoanProgRepository.ARRAY_LIST.size(); i++) {
			if (bankName.equals(LoanProgRepository.ARRAY_LIST.get(i).getBankName())) {
				LoanProgRepository.ARRAY_LIST.remove(i);
				return true;
			}
		}
		return false;
	} // End of deleteLoanInformation()

	@Override
	public LoanProgRepository getloanPrograms() {
		for (int i = 0; i < LoanProgRepository.ARRAY_LIST.size(); i++) {
			log.info(LoanProgRepository.ARRAY_LIST.get(i));
		}
		return null;
	} // End of getLoanProgram()

} // End of class
