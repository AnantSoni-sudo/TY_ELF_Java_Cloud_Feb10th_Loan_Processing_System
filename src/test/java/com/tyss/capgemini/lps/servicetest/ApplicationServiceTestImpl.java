package com.tyss.capgemini.lps.servicetest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.tyss.capgemini.lps.DAO.ApplicationDAO;
import com.tyss.capgemini.lps.beans.ApplicationBean;
import com.tyss.capgemini.lps.beans.CustomerBean;
import com.tyss.capgemini.lps.factory.FactoryDAO;
import com.tyss.capgemini.lps.service.ApplicationServices;

public class ApplicationServiceTestImpl {
	private ApplicationBean application = new ApplicationBean();
	private CustomerBean customer = new CustomerBean();

	private ApplicationServices applicationService = FactoryDAO.getApplicationServices();

	@Test
	void addApplicationTest() {
		application.setApplicationId(702);
		try {
			boolean flag = applicationService.addApplication(customer);
			assertEquals(true, flag);
		} catch (Exception e) {
			applicationService.addApplication(customer);
		}
		;
	} // end of catch block

	@Test
	void getAllApplicationTest() {
		List<ApplicationBean> allApplication = applicationService.viewApplication();
		assertNotNull(allApplication);
	}

	@Test
	void updateApplication() {
		application.setApplicationId(702);
		application.setStatus("Accept");
		try {
			boolean flag = applicationService.updateApplicationStatus(702, "Accept");
			assertEquals(flag, true);
		} catch (Exception e) {
			applicationService.updateApplicationStatus(702, "Accept");
		}
	} // end of catch block
	
	@Test
	void makeLoan() {
		application.setApplicationId(500);
		application.setFirstName("Mathew");
		application.setLastName("Anthony");
		application.setEmailId("mathew@gmail.com");
		application.setUserName("mathew12");
		application.setPassword("Mathew@123");
		application.setDateOfBirth("20/02/1988");
		application.setMobileNumber(9638527412L);
		application.setLoanType("House Extention");
		application.setStatus("Requested");
		boolean flag = applicationService.makeLoan(application);
		assertEquals(flag, true);
		
	}
	@Test
	void applicantLoanDetails() {
		boolean flag = applicationService.applicantLoanDetails("Rajuguru12", "Raju@123");
		assertEquals(flag, true);
	}  //ADD in  ApplicationServiceTestImpl

//	@Test
//	void getApplicationByStatausTest() {
//		application.setLoanType("Home Construction");
//		try {
//			ApplicationBean applicationBean = applicationDao.getAllApplication("Home Construction");
//			assertNotNull(applicationBean);
//		} catch (Exception e) {
//			applicationDao.getAllApplication(application.getStatus());
//		}
//	}
}
