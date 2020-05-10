package com.tyss.capgemini.lps.controller;

import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.tyss.capgemini.lps.beans.ApplicationBean;
import com.tyss.capgemini.lps.beans.ApprovalTeamBean;
import com.tyss.capgemini.lps.beans.CustomerBean;
import com.tyss.capgemini.lps.factory.FactoryDAO;
import com.tyss.capgemini.lps.repository.LoanProcessingSystemDB;
import com.tyss.capgemini.lps.service.ApplicationServices;
import com.tyss.capgemini.lps.service.LoanServices;
import com.tyss.capgemini.lps.validation.Validations;

public class ApprovalTeamController {
	static Logger log = Logger.getLogger(ApprovalTeamBean.class);
	List<ApplicationBean> applicationBean2 = LoanProcessingSystemDB.APPLICATION_BEANS;

	Scanner scanner = new Scanner(System.in);

	public boolean approvalLogin() {

		int count = 0;
		String userName;
		String password;
		while (true) {
			while (true) {
				log.info("Enter username :");
				userName = scanner.nextLine();
				if (Validations.isUsername(userName)) {
					break;
				} else {
					log.info("Enter Valid Username ! ");
				}
			}
			while (true) {
				log.info("Enter password :");
				password = scanner.nextLine();
				if (Validations.isPassword(password)) {
					break;
				} else {
					log.info("Enter Valid Password!!");
				}
			}
			for (ApprovalTeamBean approvalTeamBean : LoanProcessingSystemDB.APPROVAL_TEAM_BEANS) {
				if (userName.equals(approvalTeamBean.getUserName())
						&& (password.equals(approvalTeamBean.getPassword())))
					count++;
			}

			if (count > 0) {
				System.out.println("You have successfully logged in....");
				approvalMenu();
				return true;
			} else {
				log.info("Sorry! cannot access because you are not from approval department");
				return false;
			}
		}
	}

	public void approvalMenu() {


		ApplicationServices applicationServices = FactoryDAO.getApplicationServices();
		int option = 0;
		while (true) {
			log.info("Press 1 for VIEW LOAN PROGRAMS      : ");
			log.info("Press 2 to VIEW CUSTOMER APPLICATIONS  : ");
			log.info("Press 3 to UPDATE APPLICATION STATUS           : ");
			log.info("Press 4 to LOG OUT                 : ");
			String optn = scanner.nextLine();
			if (Validations.isNumber(optn)) {
				option = Integer.parseInt(optn);
				break;
			} else {
				log.info("Enter Number Only!!!");
			}
		}

		switch (option) {

		case 1:
			log.info("-------------------------------------------------------");
			log.info("||                  LOAN PROGRAMS                    ||");
			log.info("-------------------------------------------------------");
			LoanServices loanServices = FactoryDAO.getLoanServices();
			loanServices.getLoanPrograms();
			approvalMenu();
			break;

		case 2:
			log.info("---------------------------------------------");
			log.info("|             View Customer Applications             |");
			log.info("---------------------------------------------");
			List<ApplicationBean> appBean = applicationServices.viewApplication();
			for (ApplicationBean applicationBean2 : appBean) {
				log.info("*****************************************");
				log.info("Application Id    :- " + applicationBean2.getApplicationId());
				log.info("User Name         :- " + applicationBean2.getUserName());
				log.info("First Name        :- " + applicationBean2.getFirstName());
				log.info("Last Name         :- " + applicationBean2.getLastName());
				log.info("Mobile Number     :- " + applicationBean2.getMobileNumber());
				log.info("Date Of Birth     :- " + applicationBean2.getDateOfBirth());
				log.info("Email Id          :- " + applicationBean2.getEmailId());
				log.info("Status            :- " + applicationBean2.getStatus());
				log.info("*****************************************");
			}
			approvalMenu();
			break;
		case 3:
			log.info("-------------------------------------------------------");
			log.info("||      UPDATE STATUS OF REQUESTED APPLICATIONS      ||");
			log.info("-------------------------------------------------------");
			int appId=0;
			String status=null;
			
			
			
			while (true) {
				log.info("Enter Application Id    : ");
				String applicationId = scanner.nextLine();
				if (Validations.isNumber(applicationId)) {
					appId = Integer.parseInt(applicationId);
					if (Validations.validAppicationId(appId)) {
						log.info("Appication exists for this Id!!");
						for (ApplicationBean appBean1 : applicationBean2) {
							if (appId == appBean1.getApplicationId()) {
								
								log.info("Enter 1 to Accept");
								log.info("Enter 2 to Reject");
								String optn = scanner.nextLine();
								int choice =0;
								if (Validations.isNumber(optn)) {
									choice  = Integer.parseInt(optn);
									switch(choice) {
									case 1:
										status="Accept";
										log.info("Status changed to Accepted");
										break;
									case 2:
										status="Reject";
										log.info("Staus changed to Rejected");
										break;
										default:
											log.info("Please Enter Valid Choice!!");
											break;
									}
									
									if ((choice==1||choice==2) && applicationServices.updateApplicationStatus(appId,status)) {
										log.info("Application status Updated Successfully...");
										break;
									} else {
										log.info("status Updation Failed!!!");
									}
									
									break;
								} else {
									log.info("Enter Number Only!!!");
								}
							
						
							}
						}
					} else {
						log.info("Application does not exists for this Id!!");
					}
					break;
				} else {
					log.info("Enter Number Only!!");
				}
			}
			approvalMenu();
		break;
			
			
		case 4:
			log.info("LOGGED OUT...");
			HomePage.getStarted();
			break;
		default:
			log.info("Please Enter Valid Choice!!");
			break;
		}
	}
}