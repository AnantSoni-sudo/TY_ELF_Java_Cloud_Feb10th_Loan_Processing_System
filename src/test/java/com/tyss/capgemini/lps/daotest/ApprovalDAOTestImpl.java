package com.tyss.capgemini.lps.daotest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

//import java.util.List;

import org.junit.jupiter.api.Test;

//import com.tyss.capgemini.lps.DAO.ApplicationDAO;
import com.tyss.capgemini.lps.DAO.ApprovalDAO;
//import com.tyss.capgemini.lps.DAO.ApprovalDAOImpl;

import com.tyss.capgemini.lps.beans.ApprovalTeamBean;
import com.tyss.capgemini.lps.factory.FactoryDAO;
//import com.tyss.capgemini.lps.repository.LoanProcessingSystemDB;
//import com.tyss.capgemini.lps.repository.LoanProgRepository;



public class ApprovalDAOTestImpl {
	private ApprovalTeamBean approvalBean = new ApprovalTeamBean();

//	private ApprovalDAO approvalDAO = new ApprovalDAOImpl();
private ApprovalDAO approvalDAO = FactoryDAO.getApprovalDAO();

	@Test
	void addClient() {
		approvalBean.setEmpId(121);
		approvalBean.setFullName("Rajkumar");
		approvalBean.setUserName("Raj");
		approvalBean.setPassword("Qwerty");
		approvalBean.setEmailId("rajkumar12@gmail.com");
		boolean flag = approvalDAO.addClient(approvalBean);
		assertEquals(flag, true);
	}
	@Test
	void getClient() {
//		
			List<ApprovalTeamBean> loanProcessingSystemDB = approvalDAO.viewApplication();
			assertNotNull(loanProcessingSystemDB);
}
}
