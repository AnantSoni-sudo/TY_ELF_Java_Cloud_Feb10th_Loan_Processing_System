package com.tyss.capgemini.lps.repository;

import java.util.ArrayList;

import com.tyss.capgemini.lps.beans.AdminBean;
import com.tyss.capgemini.lps.beans.ApplicationBean;
import com.tyss.capgemini.lps.beans.ApprovalTeamBean;
import com.tyss.capgemini.lps.beans.CustomerBean;

public class LoanProcessingSystemDB {
	public static final ArrayList<CustomerBean> CUSTOMER_BEANS = new ArrayList<CustomerBean>();

	public static final ArrayList<AdminBean> ADMIN_BEANS = new ArrayList<AdminBean>();

	public static final ArrayList<ApprovalTeamBean> APPROVAL_TEAM_BEANS = new ArrayList<ApprovalTeamBean>();

	public static final ArrayList<ApplicationBean> APPLICATION_BEANS = new ArrayList<ApplicationBean>();

	static {
		CustomerBean customerBean1 = new CustomerBean();
		customerBean1.setCustomerId(201);
		customerBean1.setUserName("andrew12");
		customerBean1.setPassword("Andrew@123");
		customerBean1.setFirstName("Andrew");
		customerBean1.setLastName("John");
		customerBean1.setDateOfBirth("28-01-1998");
		customerBean1.setApplicationId(601);
		customerBean1.setMobileNumber(9480342924L);
		customerBean1.setLoanAccountNo(1236987456321L);
		customerBean1.setEmailId("andrew12@gmail.com");
		customerBean1.setAccountBalance(30000.23);
		customerBean1.setAmountToPay(5000.28);
		customerBean1.setLoanAmount(90000.32);
		customerBean1.setLoanAccountNo(32147852369L);
		customerBean1.setLoanApprovedDate("20-02-2020");
		customerBean1.setLoanType("Home Extention");
		CUSTOMER_BEANS.add(customerBean1);

		CustomerBean customerBean2 = new CustomerBean();
		customerBean2.setCustomerId(202);
		customerBean2.setUserName("johnny12");
		customerBean2.setPassword("Johnny@123");
		customerBean2.setFirstName("Johnny");
		customerBean2.setLastName("anthony");
		customerBean2.setApplicationId(602);
		customerBean2.setDateOfBirth("28-06-1998");
		customerBean2.setMobileNumber(9480112924L);
		customerBean2.setLoanAccountNo(1233232156321L);
		customerBean2.setEmailId("anthony12@gmail.com");
		customerBean2.setAccountBalance(50000.23);
		customerBean2.setAmountToPay(6000.28);
		customerBean2.setLoanAmount(80000.32);
		customerBean2.setLoanAccountNo(32100052369L);
		customerBean2.setLoanApprovedDate("22-01-2020");
		customerBean2.setLoanType("Home construction");
		CUSTOMER_BEANS.add(customerBean2);

		AdminBean adminBean1 = new AdminBean();
		adminBean1.setEmpId(2020001);
		adminBean1.setUserName("qwerty12");
		adminBean1.setPassword("Qwerty@123");
		adminBean1.setFirstName("Qwerty");
		adminBean1.setLastName("D");
		adminBean1.setEmailId("qwerty2@gmail.com");
		ADMIN_BEANS.add(adminBean1);


		ApprovalTeamBean approvalteamBean2 = new ApprovalTeamBean();
		approvalteamBean2.setEmpId(2020004);
		approvalteamBean2.setFullName("Manu");
		approvalteamBean2.setUserName("manukc12");
		approvalteamBean2.setPassword("Manu@123");
		approvalteamBean2.setEmailId("manu12@gmail.com");
		APPROVAL_TEAM_BEANS.add(approvalteamBean2);

		ApplicationBean applicationBean1 = new ApplicationBean();
		applicationBean1.setApplicationId(700);
		applicationBean1.setUserName("Rajuguru12");
		applicationBean1.setFirstName("Raju");
		applicationBean1.setLastName("Guru");
		applicationBean1.setPassword("Raju@123");
		applicationBean1.setDateOfBirth("20-02-1988");
		applicationBean1.setEmailId("raju@gmail.com");
		applicationBean1.setMobileNumber(9638527412L);
		applicationBean1.setStatus("Requested");
		applicationBean1.setLoanType("House Extention");
		APPLICATION_BEANS.add(applicationBean1);

		ApplicationBean applicationBean2 = new ApplicationBean();
		applicationBean2.setApplicationId(701);
		applicationBean2.setUserName("Manjuravi12");
		applicationBean2.setFirstName("Manju");
		applicationBean2.setLastName("Ravi");
		applicationBean2.setPassword("Manju@123");
		applicationBean2.setDateOfBirth("18-02-1988");
		applicationBean2.setEmailId("manju@gmail.com");
		applicationBean2.setMobileNumber(9638500002L);
		applicationBean2.setStatus("Requested");
		applicationBean2.setLoanType("House Construction");
		APPLICATION_BEANS.add(applicationBean2);

		ApplicationBean applicationBean3 = new ApplicationBean();
		applicationBean3.setApplicationId(702);
		applicationBean3.setUserName("Ravisharma12");
		applicationBean3.setFirstName("Ravi");
		applicationBean3.setLastName("Sharma");
		applicationBean3.setPassword("ravi@123");
		applicationBean3.setDateOfBirth("18-02-1987");
		applicationBean3.setEmailId("ravi.s@gmail.com");
		applicationBean3.setMobileNumber(9638500202L);
		applicationBean3.setStatus("Requested");
		applicationBean3.setLoanType("House Conversion");
		APPLICATION_BEANS.add(applicationBean3);

		ApplicationBean applicationBean4 = new ApplicationBean();
		applicationBean4.setApplicationId(704);
		applicationBean4.setUserName("Suryaraju12");
		applicationBean4.setFirstName("Surya");
		applicationBean4.setLastName("Raju");
		applicationBean4.setPassword("SuryaRaju@123");
		applicationBean4.setDateOfBirth("18-05-1988");
		applicationBean4.setEmailId("raju.s@gmail.com");
		applicationBean4.setMobileNumber(9638500002L);
		applicationBean4.setStatus("Requested");
		applicationBean4.setLoanType("House Improvement");
		APPLICATION_BEANS.add(applicationBean4);
	} // End of Block
} // End of class
