package com.tyss.capgemini.lps.repository;

import java.util.ArrayList;

import com.tyss.capgemini.lps.beans.LoanBean;

public class LoanProgRepository {
	public static final ArrayList<LoanBean> ARRAY_LIST = new ArrayList<LoanBean>();

	static {
		LoanBean loanBean1 = new LoanBean();
		loanBean1.setBankName("HDFC Bank");
		loanBean1.setLoanType("Loan Type :House Extention Loan");
		loanBean1.setEmi("EMI: 75274");
		loanBean1.setRateOfInterest("Rate of interest:8.00%");
		loanBean1.setLoanAmount("Loan Amount :500000"); 
		ARRAY_LIST.add(loanBean1);

		LoanBean loanBean2 = new LoanBean();
		loanBean2.setBankName("CANARA Bank");
		loanBean2.setLoanType("Loan Type:House Construction loan");
		loanBean2.setEmi("EMI : 26000");
		loanBean2.setRateOfInterest("Rate of Interest 7.00%");
		loanBean2.setLoanAmount("Loan Amount :5500000 ");
		ARRAY_LIST.add(loanBean2);

		LoanBean loanBean3 = new LoanBean();
		loanBean3.setBankName("VIJAYA Bank");
		loanBean3.setLoanType("Loan Type:House Improvement loan");
		loanBean3.setEmi("EMI :25000");
		loanBean3.setRateOfInterest("Rate of Interest: 7.5%");
		loanBean3.setLoanAmount("Loan Amount :2500000 ");
		ARRAY_LIST.add(loanBean3);
		
		LoanBean loanBean4 = new LoanBean();
		loanBean4.setBankName("KARNATAKA Bank");
		loanBean4.setLoanType("Loan Type:House Conversion loan");
		loanBean4.setEmi("EMI :35000");
		loanBean4.setRateOfInterest("Rate of Interest: 7.5%");
		loanBean4.setLoanAmount("Loan Amount :400000 ");
		ARRAY_LIST.add(loanBean4);
	} // End of Block
}// End of class
