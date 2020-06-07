package com.tyss.capgemini.lps.validationtest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.tyss.capgemini.lps.validation.Validations;

public class ValidationTestImpl {

	Validations validations = new Validations();

	@Test
	public void isEmail1() {
		String email = "Andrew12@gmail.com";
		boolean flag = validations.isEmail(email);
		assertEquals(flag, true);
	} // End of isEmail1()

	@Test
	public void isEmail2() {
		String email = "Andre2333";
		boolean flag = Validations.isEmail(email);
		assertEquals(flag, false);
	} // End of isEmail2()

	@Test
	public void isPassword1() {
		String password = "Johnney@343";
		boolean flag = validations.isPassword(password);
		assertEquals(flag, true);
	} // End of isPassword1()

	@Test
	public void isPassword2() {
		String password = "Johnney343";
		boolean flag = validations.isPassword(password);
		assertEquals(flag, false);
	} // End of isPassword2()

	@Test
	public void isNumber1() {
		String number = "13213";
		boolean flag = validations.isNumber(number);
		assertEquals(flag, true);
	} // End of isNumber1()

	@Test
	public void isNumber2() {
		String number = "sfafSDSD";
		boolean flag = validations.isNumber(number);
		assertEquals(flag, false);
	} // End of isNumber2()

	@Test
	public void isAccNo1() {
		String number = "13213258964";
		boolean flag = validations.isAccNo(number);
		assertEquals(flag, true);
	} // End of isAccNo1()

	@Test
	public void isAccNo2() {
		String number = "1324289787964";
		boolean flag = validations.isAccNo(number);
		assertEquals(flag, false);
	} // End of isAccNo2()

	@Test
	public void isAmount1() {
		String amount = "2342323";
		boolean flag = validations.isAmount(amount);
		assertEquals(flag, true);
	} // End of isAmount1()

	@Test
	public void isAmount2() {
		String amount = "23423232332";
		boolean flag = validations.isAmount(amount);
		assertEquals(flag, false);
	} // End of isAmount2()

	@Test
	public void isAlphabet1() {
		String alphabet = "Jeremy Brine";
		boolean flag = validations.isAlphabet(alphabet);
		assertEquals(flag, true);
	} // End of isAlphabet1()

	@Test
	public void isAlphabet2() {
		String alphabet = "Jeremy 13123";
		boolean flag = validations.isAlphabet(alphabet);
		assertEquals(flag, false);
	} // End of isAlphabet2()

	@Test
	public void isUsername1() {
		String userName = "YogiAditya12";
		boolean flag = validations.isUsername(userName);
		assertEquals(flag, true);
	} // End of isUserName1()

	@Test
	public void isUsername2() {
		String userName = "YogiAditya";
		boolean flag = validations.isUsername(userName);
		assertEquals(flag, false);
	} // End of isUserName2()

	@Test
	public void isEMI1() {
		String emi = "12312";
		boolean flag = validations.isEMI(emi);
		assertEquals(flag, true);
	} // End of isEMI1()

	@Test
	public void isEMI2() {
		String emi = "1231223";
		boolean flag = validations.isEMI(emi);
		assertEquals(flag, false);
	} // End of isEMI2()

	@Test
	public void isRateOfInterest1() {
		String roi = "12.34%";
		boolean flag = validations.isRateOfIntrest(roi);
		assertEquals(flag, true);
	} // End of isRateOFInterest1()

	@Test
	public void isRateOfInterest2() {
		String roi = "122.341";
		boolean flag = validations.isRateOfIntrest(roi);
		assertEquals(flag, false);
	} // End of isRateOfInterest2()

	@Test
	public void isDate1() {
		String date = "31/01/1995";
		boolean flag = validations.validateDate(date);
		assertEquals(flag, true);
	} // End of isDate1()

	@Test
	public void isDate2() {
		String date = "40/30/1995";
		boolean flag = validations.validateDate(date);
		assertEquals(flag, false);
	} // End of isDate2()


	@Test
	public void isMobile1() {
		String mobileNumber = "919893420430";
		boolean flag = validations.isMobile(mobileNumber);
		assertEquals(flag, true);
	} // End of isMobile1()

	@Test
	public void isMobile2() {
		String mobileNumber = "989342043023477";
		boolean flag = validations.isMobile(mobileNumber);
		assertEquals(flag, false);
	} // End of isMobile2()

} // End of class


