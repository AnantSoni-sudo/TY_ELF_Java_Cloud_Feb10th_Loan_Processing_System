package com.tyss.capgemini.lps.service;

import com.tyss.capgemini.lps.DAO.CustomerDAO;
import com.tyss.capgemini.lps.beans.CustomerBean;
import com.tyss.capgemini.lps.factory.FactoryDAO;

public class CustomerServicesImpl implements CustomerServices {
	private CustomerDAO dao = FactoryDAO.getCustomerDAO();

//	@Override
//	public boolean changePassword(CustomerBean bean) {
//		return dao.changePassword(bean);
//	}
//
//	@Override
//	public boolean payLoan(String userName, String password) {
//		return dao.payLoan(userName, password);
//	}
//
//	@Override
//	public boolean checkBalance(String userName, String password) {
//		return dao.checkBalance(userName, password);
//	}
//
//	@Override
//	public boolean addCustomer(CustomerBean customerBean) {
//		return dao.addCustomer(customerBean);
//	}
	
	@Override
	public boolean viewCustomer(String userName, String password) {
		return dao.viewCustomer(userName, password);
	} // end of viewCustomer()
}
