package com.tyss.capgemini.lps.factory;

import com.tyss.capgemini.lps.DAO.ApplicationDAO;
import com.tyss.capgemini.lps.DAO.ApplicationDAOImpl;
import com.tyss.capgemini.lps.DAO.ApprovalDAO;
import com.tyss.capgemini.lps.DAO.ApprovalDAOImpl;
import com.tyss.capgemini.lps.DAO.CustomerDAO;
import com.tyss.capgemini.lps.DAO.CustomerDAOImpl;
import com.tyss.capgemini.lps.DAO.LoanDAO;
import com.tyss.capgemini.lps.DAO.LoanDAOImpl;
import com.tyss.capgemini.lps.service.ApplicationServices;
import com.tyss.capgemini.lps.service.ApplicationServicesImpl;
import com.tyss.capgemini.lps.service.ApprovalService;
import com.tyss.capgemini.lps.service.ApprovalServiceImpl;
import com.tyss.capgemini.lps.service.CustomerServices;
import com.tyss.capgemini.lps.service.CustomerServicesImpl;
import com.tyss.capgemini.lps.service.LoanServices;
import com.tyss.capgemini.lps.service.LoanServicesImpl;

public class FactoryDAO {

	public static CustomerServices getCustomerServices() {
		return new CustomerServicesImpl();
	}



	public static ApplicationServices getApplicationServices() {
		return new ApplicationServicesImpl();
	}

	public static LoanServices getLoanServices() {
		return new LoanServicesImpl();
	}

	public static ApprovalService getApprovalService() {
		return new ApprovalServiceImpl();
	}



	public static CustomerDAO getCustomerDAO() {
		return new CustomerDAOImpl();
	}



	public static ApplicationDAO getApplicationDAO() {
		return new ApplicationDAOImpl();
	}

	public static LoanDAO getLoanDAO() {
		return new LoanDAOImpl();
	}

	public static ApprovalDAO getApprovalDAO() {
		return new ApprovalDAOImpl();
	}
}
