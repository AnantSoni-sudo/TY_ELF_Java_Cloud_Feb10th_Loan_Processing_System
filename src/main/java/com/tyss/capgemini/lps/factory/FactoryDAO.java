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

	/**
	 * 
	 * @return
	 */
	public static CustomerServices getCustomerServices() {
		return new CustomerServicesImpl();
	} // End of getCustomerService()

	/**
	 * 
	 * @return
	 */
	public static ApplicationServices getApplicationServices() {
		return new ApplicationServicesImpl();
	} // End of getApplicationServices()

	/**
	 * 
	 * @return
	 */
	public static LoanServices getLoanServices() {
		return new LoanServicesImpl();
	} // End of getLoanServices()

	/**
	 * 
	 * @return
	 */
	public static ApprovalService getApprovalService() {
		return new ApprovalServiceImpl();
	} // End of getApprovalService()

	/**
	 * 
	 * @return
	 */
	public static CustomerDAO getCustomerDAO() {
		return new CustomerDAOImpl();
	} // End of getCustomerDAO()
	
	/**
	 * 
	 * @return
	 */
	public static ApplicationDAO getApplicationDAO() {
		return new ApplicationDAOImpl();
	} // End of getApplicationDAO()

	/**
	 * 
	 * @return
	 */
	public static LoanDAO getLoanDAO() {
		return new LoanDAOImpl();
	} // End of getLoanDAO()

	/**
	 * 
	 * @return
	 */
	public static ApprovalDAO getApprovalDAO() {
		return new ApprovalDAOImpl();
	} // End of getApprovalDAO()
} // End of class
