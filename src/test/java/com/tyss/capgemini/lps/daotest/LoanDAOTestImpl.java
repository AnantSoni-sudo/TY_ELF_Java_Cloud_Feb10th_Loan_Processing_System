package com.tyss.capgemini.lps.daotest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.tyss.capgemini.lps.beans.LoanBean;
import com.tyss.capgemini.lps.DAO.LoanDAO;
import com.tyss.capgemini.lps.DAO.LoanDAOImpl;
import com.tyss.capgemini.lps.repository.LoanProgRepository;

public class LoanDAOTestImpl {
//	private LoanBean loanBean = new LoanBean();
//
//	private LoanDAO loanDAO = new LoanDAOImpl();
//
//	@Test
//	void addLoanInformation() {
//		loanBean.setBankName("HDFC Bank");
//		loanBean.setEmi("4500");
//		loanBean.setLoanAmount("200000");
//		loanBean.setLoanType("Home Loan");
//		loanBean.setRateOfInterest("8.0%");
////		try {
//		boolean flag = loanDAO.addLoanInformation(loanBean);
//			assertEquals(flag, true);
////		} catch (Exception e) {
////			assertThrows(UsernameAlreadyExistException.class, () -> {
////				loanDAO.addLoanInformation(loanBean);
////			});
////		}
//	}// end of addLoanInformation
//
//	@Test
//	void deleteLoanInformation() {
//		loanBean.setBankName("HDFC Bank");
//		boolean flag = loanDAO.deleteLoanInformation(loanBean.getBankName());
//		assertTrue(flag);
//	}// end of deleteLoanInformation
//
//	@Test
//	void getLoanInformation() {
////		try {
//			LoanProgRepository loanProgRepository = loanDAO.getloanPrograms();
//			assertNull(loanProgRepository);
////	}
////			catch (Exception e) {
//////			assertThrows(UsernameAlreadyExistException.class, () -> {
//////				loanDAO.addLoanInformation(loanBean);
//////			});
//////		}
//	}// end of getLoanInformation
//
////	@Test
////	void makeLoan() {
////		try {
////			LoanProgRepository loanProgRepository = loanDAO.getloanPrograms();
////			assertNull(loanProgRepository);
////		} catch (Exception e) {
////			assertThrows(UsernameAlreadyExistException.class, () -> {
////				loanDAO.addLoanInformation(loanBean);
////			});
////		}
////	}// end of makeLoan

	
	
	
	
	
	private LoanBean loanBean = new LoanBean();

	private LoanDAO loanDAO = new LoanDAOImpl();

	@Test
	void addLoanInformation() {
		loanBean.setBankName("HDFC Bank");
		loanBean.setEmi("4500");
		loanBean.setLoanAmount("200000");
		loanBean.setLoanType("Home Loan");
		loanBean.setRateOfInterest("8.0%");
		
			boolean flag = loanDAO.addLoanInformation(loanBean);
			assertEquals(flag, true);			
				loanDAO.addLoanInformation(loanBean);
		
	}// end of addLoanInformation

	@Test
	void deleteLoanInformation() {
		loanBean.setBankName("HDFC Bank");
		boolean flag = loanDAO.deleteLoanInformation(loanBean.getBankName());
		assertTrue(flag);
	}// end of deleteLoanInformation

	@Test
	void getLoanInformation() {
			LoanProgRepository loanProgRepository = loanDAO.getloanPrograms();
			assertNull(loanProgRepository);
				loanDAO.addLoanInformation(loanBean);
			
	}// end of getLoanInformation

	@Test
	void makeLoan() {
	
			LoanProgRepository loanProgRepository = loanDAO.getloanPrograms();
			assertNull(loanProgRepository);
		
				loanDAO.addLoanInformation(loanBean);
		
	}// end of makeLoan

}   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

