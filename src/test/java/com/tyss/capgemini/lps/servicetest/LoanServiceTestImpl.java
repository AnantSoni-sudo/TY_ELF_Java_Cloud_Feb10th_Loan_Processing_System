package com.tyss.capgemini.lps.servicetest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

//import com.tyss.capgemini.lps.DAO.CustomerDAO;
import com.tyss.capgemini.lps.DAO.LoanDAO;
//import com.tyss.capgemini.lps.DAO.LoanDAOImpl;
//import com.tyss.capgemini.lps.beans.CustomerBean;
import com.tyss.capgemini.lps.beans.LoanBean;

import com.tyss.capgemini.lps.factory.FactoryDAO;
import com.tyss.capgemini.lps.repository.LoanProgRepository;
import com.tyss.capgemini.lps.service.LoanServices;
import com.tyss.capgemini.lps.service.LoanServicesImpl;

public class LoanServiceTestImpl {
//	private LoanBean loanBean = new LoanBean();
//
//	private LoanDAO loanDAO = new LoanDAOImpl();
//	
//	private LoanBean loanBean = new LoanBean();
//
//	private LoanDAO loanDAO = FactoryDAO.getLoanDAO();
//
//	@Test
//	void addLoanInformation() {
//		loanBean.setBankName("HDFC Bank");
//		loanBean.setEmi("4500");
//		loanBean.setLoanAmount("200000");
//		loanBean.setLoanType("Home Loan");
//		loanBean.setRateOfInterest("8.0%");
//		try {
//			boolean flag = loanDAO.addLoanInformation(loanBean);
//			assertEquals(flag, true);
//		} catch (Exception e) {
//			assertThrows(UsernameAlreadyExistException.class, () -> {
//				loanDAO.addLoanInformation(loanBean);
//			});
//		}
//	}
//
//	@Test
//	void makeLoan() {
//		try {
//			LoanProgRepository loanProgRepository = loanDAO.getloanPrograms();
//			assertNull(loanProgRepository);
//		} catch (Exception e) {
//			assertThrows(UsernameAlreadyExistException.class, () -> {
//				loanDAO.addLoanInformation(loanBean);
//			});
//		}
//	}// end of makeLoan
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
//		try {
//			LoanProgRepository loanProgRepository = loanDAO.getloanPrograms();
//			assertNull(loanProgRepository);
//		} catch (Exception e) {
//			assertThrows(UsernameAlreadyExistException.class, () -> {
//				loanDAO.addLoanInformation(loanBean);
//			});
//		}
//	}// end of getLoanInformation
//
//}












private LoanBean loanBean = new LoanBean();

//private LoanDAO loanDAO = new LoanDAOImpl();
private LoanServices services = new LoanServicesImpl();

@Test
void addLoanInformation() {
	loanBean.setBankName("HDFC Bank");
	loanBean.setEmi("4500");
	loanBean.setLoanAmount("200000");
	loanBean.setLoanType("Home Loan");
	loanBean.setRateOfInterest("8.0%");
		boolean flag = services.addLoanInformation(loanBean);
		assertEquals(flag, true);			
			services.addLoanInformation(loanBean);
}
@Test
void makeLoan() {

		LoanProgRepository loanProgRepository = services.getLoanPrograms();
		assertNull(loanProgRepository);
	 services.addLoanInformation(loanBean);

}// end of makeLoan


@Test
void deleteLoanInformation() {
	loanBean.setBankName("HDFC Bank");
	boolean flag = services.deleteLoanInformation(loanBean.getBankName());
	assertTrue(flag);
}// end of deleteLoanInformation

@Test
void getLoanInformation() {
		LoanProgRepository loanProgRepository = services.getLoanPrograms();
		assertNull(loanProgRepository);
	
			services.addLoanInformation(loanBean);
	}
}// end of getLoanInformation

