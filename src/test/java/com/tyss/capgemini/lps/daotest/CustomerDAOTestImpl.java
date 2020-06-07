package com.tyss.capgemini.lps.daotest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.tyss.capgemini.lps.DAO.CustomerDAO;
import com.tyss.capgemini.lps.beans.CustomerBean;

import com.tyss.capgemini.lps.factory.FactoryDAO;

public class CustomerDAOTestImpl {
	private CustomerBean customer = new CustomerBean();

	private CustomerDAO customerDAO = FactoryDAO.getCustomerDAO();

	@Test
	void viewCustomer() {

		boolean flag = customerDAO.viewCustomer("andrew12", "Andrew@123");
		assertEquals(flag, true);
	} // End of viewCustomer()

}// End of class


