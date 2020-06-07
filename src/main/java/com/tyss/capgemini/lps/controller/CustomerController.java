package com.tyss.capgemini.lps.controller;

import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.tyss.capgemini.lps.beans.ApplicationBean;
import com.tyss.capgemini.lps.beans.ApprovalTeamBean;
import com.tyss.capgemini.lps.beans.CustomerBean;
import com.tyss.capgemini.lps.exception.IdExistsException;
import com.tyss.capgemini.lps.exception.UserNameException;
import com.tyss.capgemini.lps.exception.UserNotFoundException;
import com.tyss.capgemini.lps.factory.FactoryDAO;
import com.tyss.capgemini.lps.repository.LoanProcessingSystemDB;
import com.tyss.capgemini.lps.service.ApplicationServices;
import com.tyss.capgemini.lps.service.CustomerServices;
import com.tyss.capgemini.lps.service.CustomerServicesImpl;
import com.tyss.capgemini.lps.service.LoanServices;
import com.tyss.capgemini.lps.service.LoanServicesImpl;
import com.tyss.capgemini.lps.validation.Validations;
/**
 * 
 * @author Anant
 *
 */
public class CustomerController {
	static Logger log = LogManager.getLogger(CustomerController.class);
	Scanner scanner = new Scanner(System.in);

	/**
	 * 
	 * @return boolean
	 */
	public boolean logIn() {
		int counter = 0;
		String userName;
		String password;
		while (true) {
			while (true) {
				log.info("\nEnter Username : ");
				userName = scanner.nextLine();
				if (Validations.isUsername(userName)) {
					break;
				} else {
					log.info("Enter Valid Username!!");
				}
			}
			while (true) {
				log.info("Enter password   : ");
				password = scanner.nextLine();
				if (Validations.isPassword(password)) {
					break;
				} else {
					log.info("Enter Valid Password!!");
				}
			}
			for (int i = 0; i < LoanProcessingSystemDB.CUSTOMER_BEANS.size(); i++) {
				if (userName.equals(LoanProcessingSystemDB.CUSTOMER_BEANS.get(i).getUserName())
						&& password.equals(LoanProcessingSystemDB.CUSTOMER_BEANS.get(i).getPassword())) {
					counter++;
				}
			}
			try {
				if (counter > 0) {
					System.out.println("You have successfully logged in...");
					menuOption(userName, password);
					return true;
				} else {
					throw new UserNotFoundException("Invalid Username or Password");

				}
			}catch(UserNotFoundException e) {
				log.info(e.getMsg());
			}
		}
	} // End of logIn()

	/**
	 * 
	 * @param appId
	 * @return boolean
	 */
	public boolean isApplicationId(Integer appId) {
		for (ApplicationBean applicationBean : LoanProcessingSystemDB.APPLICATION_BEANS) {
			if (appId.equals(applicationBean.getApplicationId())) {
				return true;
			}
		}
		return false;
	} // End of isApplicationId()

	/**
	 * 
	 * @param userName
	 * @return boolean
	 */
	public boolean isUserName(String userName) {
		for (ApplicationBean applicationBean : LoanProcessingSystemDB.APPLICATION_BEANS) {
			if (userName.equals(applicationBean.getUserName())) {
				return true;
			}
		}
		return false;
	} // End of isUserName()

	/**
	 * void
	 */
	public void makeLoan() {
		ApplicationServices applicationService = FactoryDAO.getApplicationServices();
		ApplicationBean applicationBean = new ApplicationBean();
		String loanType = null;
		int choice = 0;
		while(true) {
			log.info("Enter Application Id :- ");
			try {
				int appId =0;
				String id = scanner.nextLine();
				if (Validations.isNumber(id)) {
					appId=Integer.parseInt(id);
					if(isApplicationId(appId)) {
						throw new IdExistsException("This Application Id Already Exists");
					}
					else {

						applicationBean.setApplicationId(appId);
					}
					break;
				}

				else {
					log.info("Enter Number Only!!!");
				}
			}
			catch (IdExistsException e) {
				log.info(e.getMsg());
			}

		}

		while(true) {
			log.info("Enter Username :- ");
			try {
				String userName = scanner.nextLine().trim();
				if (Validations.isUsername(userName)) {
					if(isUserName(userName)) {
						throw new UserNameException("This Username already exist....!!");
					}
					else {
						applicationBean.setUserName(userName);

					}
					break;
				}else {
					log.info("username must contain minimum 6 alphabets and atleast 1 number");
				}
			}catch (UserNameException e) {
				log.info(e.getMsg());
			}
		}
		while(true) {
			log.info("Enter Password :- ");
			String password = scanner.nextLine().trim();
			if (Validations.isPassword(password)) {
				applicationBean.setPassword(password);
				break;
			} else {
				log.info("password should contain min 8 characters ,atleast 1 upper case alphabet, "
						+ "1 lowercase,1 special character and 1 number ");
			}

		}

		while(true) {
			log.info("Enter First Name :- ");
			String firstName = scanner.nextLine().trim();
			if (Validations.isAlphabet(firstName)) {
				applicationBean.setFirstName(firstName);
				break;
			} else {
				log.info("Enter alphabets only!");
			}
		}

		while(true) {
			log.info("Enter Last Name :- ");
			String lastName = scanner.nextLine().trim();
			if (Validations.isAlphabet(lastName)) {
				applicationBean.setLastName(lastName);
				break;
			} else {
				log.info("Enter alphabets only!");
			}
		}

		while (true) {
			log.info("Enter Applicant EmailId :- ");
			String email = scanner.nextLine().trim();
			if (Validations.isEmail(email)) {
				applicationBean.setEmailId(email);
				break;
			} else {
				log.info("Enter proper Email-Id!");
			}
		}

		while(true) {
			log.info("Enter Mobile Number :- ");
			String mobileNumber = scanner.nextLine().trim();
			if (Validations.isMobile(mobileNumber)) {
				applicationBean.setMobileNumber(Long.parseLong(mobileNumber));
				break;
			} else {
				log.info("Enter valid  mobile number!");
			}
		}
		while(true) {
			log.info("Enter Date of Birth :- ");
			String dob = scanner.nextLine().trim();
			if (Validations.validateDate(dob)) {
				applicationBean.setDateOfBirth(dob);
				break;
			} else {
				log.info(" Date-of-Birth should be in the pattern dd/mm/yy!");
			}
		}
		while(true) {
			log.info("Enter Account Number :- ");
			String accNumber = scanner.nextLine().trim();
			if (Validations.isAccNo(accNumber)) {
				applicationBean.setMobileNumber(Long.parseLong(accNumber));
				break;
			} else {
				log.info("Enter valid 11 digit  Account Number!");
			}
		}
		while (true) {
			log.info("Enter loan type  :- ");
			log.info("Available loans  :- ");
			log.info("1 - House Extention");
			log.info("2 - House Construction");
			log.info("3 - House Conversion");
			log.info("4 - House Improvement");
			log.info("Enter your choice :- ");
			String option = scanner.nextLine().trim();
			if (Validations.isNumber(option)) {
				choice = Integer.parseInt(option);
				break;
			}
			else {
				log.info("Please numbers only....!!");
			}
			switch (choice) {
			case 1:
				loanType = "House Extention";
				applicationBean.setLoanType(loanType);
				break;
			case 2:
				loanType = "House Construction";
				applicationBean.setLoanType(loanType);
				break;
			case 3:
				loanType = "House Conversion";
				applicationBean.setLoanType(loanType);
				break;
			case 4:
				loanType = "House Improvement";
				applicationBean.setLoanType(loanType);
				break;
			default:
				log.info("Invalid option!");
				break;
			}

		}
		while (true) {
			String status = "Requested";
			if (Validations.isAlphabet(status)) {
				applicationBean.setStatus(status);
				break;
			}
		}
		if ((choice==1|| choice==2|| choice==3|| choice==4)&&applicationService.makeLoan(applicationBean)) {
			LoanProcessingSystemDB.APPLICATION_BEANS.add(applicationBean);
			log.info("Applied Successfully..");
		} else {
			log.info("Request Failed");
		}

	}// End of makeLoan()
	
	
	/**
	 * 
	 * @param userName
	 * @param password
	 */
	public void menuOption(String userName, String password) {
		CustomerServices customerService = FactoryDAO.getCustomerServices();
		int choice = 0;
		while (true) {
			log.info("Press 1 to MAKE LOAN           :");
			log.info("Press 2 to VIEW LOAN PROGRAMS  :");
			log.info("Press 3 to LOAN DETAILS        :");
			log.info("Press 4 to log-out             :");
			log.info("Enter your choice              :");
			String option = scanner.nextLine().trim();
			if (Validations.isNumber(option)) {
				choice = Integer.parseInt(option);
				break;
			}
			else {
				log.info("Please enter number only!!");
			}
		}
		switch (choice) {
		case 1:
			log.info("------------------------------------------------");
			log.info("||            Make Loan Section               ||");
			log.info("------------------------------------------------");
			makeLoan();
			menuOption(userName, password);
			break;
		case 2:
			log.info("------------------------------------------------");
			log.info("||            View Loan Programs              ||");
			log.info("------------------------------------------------");
			//			customerService.loanDetails();
			LoanServices loanServices1 = FactoryDAO.getLoanServices();
			loanServices1.getLoanPrograms();
			menuOption(userName, password);
			break;

		case 3:
			log.info("------------------------------------------------");
			log.info("||              Loan Details                  ||");
			log.info("------------------------------------------------");
			customerService.viewCustomer(userName, password);
			menuOption(userName, password);
			break;	

		case 4:
			log.info(" logged out successfully!");
			HomePage.getStarted();
			break;

		default:
			log.info("Enter proper Choice");
			break;
		}
	} // End of menuOption()
}// End of class