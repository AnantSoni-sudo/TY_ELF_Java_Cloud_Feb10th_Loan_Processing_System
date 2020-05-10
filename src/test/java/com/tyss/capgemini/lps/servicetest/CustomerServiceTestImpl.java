package com.tyss.capgemini.lps.servicetest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.tyss.capgemini.lps.factory.FactoryDAO;
import com.tyss.capgemini.lps.service.CustomerServices;



public class CustomerServiceTestImpl {
	


	private CustomerServices customerService = FactoryDAO.getCustomerServices();

	@Test
	void viewCustomer() {
		
			boolean flag = customerService.viewCustomer("andrew12", "Andrew@123");
			assertEquals(flag, true);
		
		
		
	}
	
	
}