package unittests;

import business.UserAccount;
import junit.framework.TestCase;


public class FirstNameTests extends TestCase {

	public void testValidFirstName() {
		assertTrue(UserAccount.isFirstNameValid("john"));
	}
	
	public void testNoDigits() {
		assertFalse(UserAccount.isFirstNameValid("John117"));
	}
	
	public void testNoSpecial() {
		assertFalse(UserAccount.isFirstNameValid("$am"));
	}
	

}
