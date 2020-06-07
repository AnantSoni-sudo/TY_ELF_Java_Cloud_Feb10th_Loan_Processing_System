package com.tyss.capgemini.lps.daotest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;


import org.junit.jupiter.api.Test;

import com.tyss.capgemini.lps.DAO.ApprovalDAO;

import com.tyss.capgemini.lps.beans.ApprovalTeamBean;
import com.tyss.capgemini.lps.factory.FactoryDAO;



public class ApprovalDAOTestImpl {
	private ApprovalTeamBean approvalBean = new ApprovalTeamBean();

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
	} // End of addClient()
	
	@Test
	void getClient() {
		List<ApprovalTeamBean> loanProcessingSystemDB = approvalDAO.viewApplication();
		assertNotNull(loanProcessingSystemDB);
	} // End of getClient()
} // End of class
