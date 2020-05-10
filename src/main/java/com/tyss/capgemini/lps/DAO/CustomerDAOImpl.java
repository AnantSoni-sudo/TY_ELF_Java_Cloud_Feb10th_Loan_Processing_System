package com.tyss.capgemini.lps.DAO;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.tyss.capgemini.lps.beans.ApplicationBean;
import com.tyss.capgemini.lps.repository.LoanProcessingSystemDB;



public class CustomerDAOImpl implements CustomerDAO {
	static Logger log = LogManager.getLogger(CustomerDAOImpl.class);

	@Override
	public boolean viewCustomer(String userName, String password) {
		for (int i = 0; i < LoanProcessingSystemDB.CUSTOMER_BEANS.size(); i++) {
			if (userName.equals(LoanProcessingSystemDB.CUSTOMER_BEANS.get(i).getUserName())
					&& password.equals(LoanProcessingSystemDB.CUSTOMER_BEANS.get(i).getPassword())) {
				log.info("Profile :- \n" 
						+ "Application ID      : " + LoanProcessingSystemDB.CUSTOMER_BEANS.get(i).getApplicationId() + "\n"
						+ "Customer Number     : " + LoanProcessingSystemDB.CUSTOMER_BEANS.get(i).getCustomerId() + "\n" 
						+ "First Name          : " + LoanProcessingSystemDB.CUSTOMER_BEANS.get(i).getFirstName() + "\n" 
						+ "Last Name           : " + LoanProcessingSystemDB.CUSTOMER_BEANS.get(i).getLastName() + "\n" 
						+ "Username            : " + LoanProcessingSystemDB.CUSTOMER_BEANS.get(i).getUserName() + "\n"
						+ "Password            : " + LoanProcessingSystemDB.CUSTOMER_BEANS.get(i).getPassword() + "\n"
						+ "Email               : " + LoanProcessingSystemDB.CUSTOMER_BEANS.get(i).getEmailId() + "\n"
						+ "Date of Birth       : " + LoanProcessingSystemDB.CUSTOMER_BEANS.get(i).getDateOfBirth() + "\n"
						+ "Mobile Number       : " + LoanProcessingSystemDB.CUSTOMER_BEANS.get(i).getMobileNumber() + "\n"
						+ "Loan Account Number : " + LoanProcessingSystemDB.CUSTOMER_BEANS.get(i).getLoanAccountNo() + "\n"
						+ "Loan Type           : " + LoanProcessingSystemDB.CUSTOMER_BEANS.get(i).getLoanType() + "\n"
						+ "Account Balance     : " + LoanProcessingSystemDB.CUSTOMER_BEANS.get(i).getAccountBalance() + "\n"
						+ "Amount To Pay       : " + LoanProcessingSystemDB.CUSTOMER_BEANS.get(i).getAmountToPay() + "\n"
						+ "Loan Amount         : " + LoanProcessingSystemDB.CUSTOMER_BEANS.get(i).getLoanAmount() + "\n"
						+ "Loan Approval Date  : " + LoanProcessingSystemDB.CUSTOMER_BEANS.get(i).getLoanApprovedDate());
				
				return true;
			}
		}
		return false;
	} // end of viewCustomer()

//	@Override
//	public boolean loanDetails() {
//		for (LoanBean bean : LoanProgRepository.ARRAY_LIST) {
//			log.info(LoanProgRepository.ARRAY_LIST + "\n");
//			return true;
//		}
//		return false;
//	} // end of loanDetails()

//	@Override
//	public boolean makeLoan(ApplicationBean bean) {
//		for (ApplicationBean applicationBean : LoanProcessingSystemDB.APPLICATION_BEANS) {
//			if(applicationBean.getApplicationId().equals(bean.getApplicationId()))
//				return false;
//		}
////		LoanProcessingSystemDB.APPLICATION_BEANS.add(bean);
//		return true;
//	} // end of makeLoan()

} // en