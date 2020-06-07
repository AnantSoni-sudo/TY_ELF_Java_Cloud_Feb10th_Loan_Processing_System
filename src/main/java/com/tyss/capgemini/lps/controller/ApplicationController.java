package com.tyss.capgemini.lps.controller;

import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.tyss.capgemini.lps.exception.UserNotFoundException;
import com.tyss.capgemini.lps.factory.FactoryDAO;
import com.tyss.capgemini.lps.repository.LoanProcessingSystemDB;
import com.tyss.capgemini.lps.service.ApplicationServices;
import com.tyss.capgemini.lps.service.LoanServices;
import com.tyss.capgemini.lps.validation.Validations;

/**
 * 
 * @author Anant
 *
 */
public class ApplicationController {
	static Logger log = LogManager.getLogger(CustomerController.class);
	Scanner scanner = new Scanner(System.in);
	/**
	 * 
	 * @return
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
			// || LoanProcessingSystemDB.APPLICATION_BEANS.size()
			for (int i = 0; i < LoanProcessingSystemDB.APPLICATION_BEANS.size(); i++) {
				if(userName.equals(LoanProcessingSystemDB.APPLICATION_BEANS.get(i).getUserName()) 
						&& password.equals(LoanProcessingSystemDB.APPLICATION_BEANS.get(i).getPassword())) {
					counter++;
				}
			}
			try {
			if (counter > 0) {
				System.out.println("You have successfully logged in...");
				menuOption(userName, password);
				return true;
			} else {
				throw new UserNotFoundException(" Invalid Username or Password");
			}
		}
		
			catch (UserNotFoundException e) {
				log.info(e.getMsg());
			}
	}
	} // End of logIn()
	
	/**
	 * 
	 * @param userName
	 * @param password
	 */
	public void menuOption(String userName, String password) {
		ApplicationServices applicationServices = FactoryDAO.getApplicationServices();
		LoanServices loanServices = FactoryDAO.getLoanServices();
		int choice1 = 0;
		while (true) {
			log.info("Press 1 to VIEW LOAN PROGRAMS             :");
			log.info("Press 2 to  Applicant Loan Details        :");
			log.info("Press 3 to log-out                        :");
			log.info("Enter your choice                         :");
			String option = scanner.nextLine();
			if (Validations.isNumber(option)) {
				choice1 = Integer.parseInt(option);
				break;
			}
			else {
				log.info("Please enter number only!!");
			}
		}
		switch (choice1) {
		case 1:
			log.info("------------------------------------------------");
			log.info("||            View Loan Programs              ||");
			log.info("------------------------------------------------");
			loanServices.getLoanPrograms();
			menuOption(userName, password);
			break;

		case 2:
			log.info("------------------------------------------------");
			log.info("||         Applicant  Loan  Details           ||");
			log.info("------------------------------------------------");
			applicationServices.applicantLoanDetails(userName, password);
			menuOption(userName, password);
			break;	

		case 3:
			log.info(" logged out successfully!");
			HomePage.getStarted();
			break;

		default:
			log.info("Enter valid Choice");
			break;
		}
	} // End of menuOption()

}// End of class
