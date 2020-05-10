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
	}

	@Override
	public List<ApplicationBean> viewApplication() {
		return dao.viewApplication();
	}

	@Override
	public boolean updateApplicationStatus(int appId, String status) {
		return dao.updateApplicationStatus(appId, status);
	}

	@Override
	public ApplicationBean getAllApplication(String loanType) {
		return dao.getAllApplication(loanType);
	}
	@Override
	public boolean makeLoan(ApplicationBean applicationBean) {
		return dao.makeLoan(applicationBean);
	}// end of makeLoan()

	@Override
	public boolean applicantLoanDetails(String userName, String password) {
		return dao.applicantLoanDetails( userName, password);
	}
}
