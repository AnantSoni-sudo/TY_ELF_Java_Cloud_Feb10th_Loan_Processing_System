package com.tyss.capgemini.lps.service;

import java.util.List;

import com.tyss.capgemini.lps.DAO.ApplicationDAO;
import com.tyss.capgemini.lps.beans.ApplicationBean;
import com.tyss.capgemini.lps.beans.CustomerBean;
import com.tyss.capgemini.lps.factory.FactoryDAO;

public class ApplicationServicesImpl implements ApplicationServices {
	private ApplicationDAO dao = FactoryDAO.getApplicationDAO();
	
	@Override
	public boolean addApplication(CustomerBean customerBean) {
		return dao.addApplication(customerBean);
	} // End of addApplication()

	@Override
	public List<ApplicationBean> viewApplication() {
		return dao.viewApplication();
	} // End of viewApplication()

	@Override
	public boolean updateApplicationStatus(int appId, String status) {
		return dao.updateApplicationStatus(appId, status);
	} // End of updateApplicationStatus()

	@Override
	public ApplicationBean getAllApplication(String loanType) {
		return dao.getAllApplication(loanType);
	} // End of getAllApplication() 
	
	@Override
	public boolean makeLoan(ApplicationBean applicationBean) {
		return dao.makeLoan(applicationBean);
	}// End of makeLoan()

	@Override
	public boolean applicantLoanDetails(String userName, String password) {
		return dao.applicantLoanDetails( userName, password);
	} // End of applicantLoanDetails()
}// End of class
