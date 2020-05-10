package com.tyss.capgemini.lps.validation;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.regex.Pattern;

import com.tyss.capgemini.lps.beans.ApplicationBean;
import com.tyss.capgemini.lps.repository.LoanProcessingSystemDB;

public class Validations {
	public static boolean isPassword(String str) {
		return ((str != null) && (!str.equals("")) && (str.matches("((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,40})")));
	}

	public static boolean isEmail(String email) {
		String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern pattern = Pattern.compile(emailRegex);
		if (email == null) {
			return false;
		} else {
			return pattern.matcher(email).matches();
		}
	}

	public static boolean isNumber(String num) {
		if (num.matches("[0-9]+")) {
			return true;
		}
		return false;
	}
	public static boolean isAccNo(String num) {
		if (num.matches("[0-9]{11,11}")) {
			return true;
		}
		return false;
	}

	public static boolean isAmount(String num) {
		if (num.matches("[0-9]{4,7}")) {
			return true;
		}
		return false;
	}
	
	public static boolean isUsername(String un) {
		if (un.matches("[a-zA-Z]{6,10}+[0-9]{1,4}")) {
			return true;
		}
		return false;

	}
	
	public static boolean isAlphabet(String alph) {
		if (alph.matches("[a-zA-Z ]+")) {
			return true;
		}
		return false;
	}

//	public static boolean isEMI(String emi) {
//		if (emi.matches("^[0-9]+(\\.[0-9]{1,2})?$")) {
//			return true;
//		}
//		return false;
//	}
	
	public static boolean isEMI(String emi) {
		if (emi.matches("[0-9]{4,5}")) {
			return true;
		}
		return false;
	}
	
	public static boolean isRateOfIntrest(String roi) {
		if (roi.matches("[0-9]{1,2}+.[0-9]{1,4}+%")) {
			return true;
		}
		return false;
	}
//	public static boolean validateDate(String date) {
//		DateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
//		sdf.setLenient(false);
//		try {
//			sdf.parse(date);
//		} catch (ParseException e) {
//			return false;
//		}
//		return true;
//	}
	public static boolean validateDate(String date) {
		DateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		sdf.setLenient(false);
		try {
			sdf.parse(date);
		} catch (ParseException e) {
			return false;
		}
		return true;
	} // end of validDate()

	public static boolean validAppicationId(int id) {
		List<ApplicationBean> appBean = LoanProcessingSystemDB.APPLICATION_BEANS;
		for (ApplicationBean appInfo : appBean) {
			if (appInfo.getApplicationId() == id) {
				return true;
			}
		}
		return false;
	}
	
	
//	public static boolean isOneDigit(String num) {
//		if (num.matches("[\\d]")) {
//			return true;
//		}
//		return false;
//	} // end of isOneDigit()	
	public static boolean isMobile(String num) {
	if (num.matches("[0-9]{10,13}")) {
		return true;
	}
	return false;
}

}
