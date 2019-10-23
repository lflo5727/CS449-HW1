package unittests;

import business.UserAccount;
import junit.framework.TestCase;


public class PhoneNumberTests extends TestCase {

	public void testValidPhoneNumber() {
		assertTrue(UserAccount.isPhoneNumberValid("8162356218"));
	}
	
	public void testTooLong() {
		assertFalse(UserAccount.isPhoneNumberValid("81623562185"));
	}
	
	public void testTooShort() {
		assertFalse(UserAccount.isPhoneNumberValid("816235621"));
	}

}
