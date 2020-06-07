package com.tyss.capgemini.lps.service;

import com.tyss.capgemini.lps.DAO.CustomerDAO;
import com.tyss.capgemini.lps.beans.CustomerBean;
import com.tyss.capgemini.lps.factory.FactoryDAO;

public class CustomerServicesImpl implements CustomerServices {
	private CustomerDAO dao = FactoryDAO.getCustomerDAO();
	
	@Override
	public boolean viewCustomer(String userName, String password) {
		return dao.viewCustomer(userName, password);
	} // End of viewCustomer()
} // End of class
