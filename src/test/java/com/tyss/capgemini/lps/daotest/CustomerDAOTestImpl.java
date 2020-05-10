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
	
		}
		
//		@Test
//		void makeLoan() {
//			applicationBean.setApplicationId(500);
//			applicationBean.setFirstName("Mathew");
//			applicationBean.setLastName("Anthony");
//			applicationBean.setEmailId("mathew@gmail.com");
//			applicationBean.setUserName("mathew12");
//			applicationBean.setPassword("Mathew@123");
//			applicationBean.setDateOfBirth("20/02/1988");
//			applicationBean.setMobileNumber(9638527412L);
//			applicationBean.setLoanType("House Extention");
//			applicationBean.setStatus("Requested");
//			try {
//				boolean flag = customerDAO.makeLoan(applicationBean);
//				assertEquals(flag, true);
//			} catch (Exception e) {
//				assertThrows(UsernameAlreadyExistException.class, () -> {
//					customerDAO.makeLoan(applicationBean);
//				});
//			}
//		}
		
	}


