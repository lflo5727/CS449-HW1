package unittests;

import business.UserAccount;
import junit.framework.TestCase;


public class LastNameTests extends TestCase {

	public void testValidLastName() {
		assertTrue(UserAccount.isLastNameValid("Smith"));
	}
	
	public void testNoDigits() {
		assertFalse(UserAccount.isLastNameValid("Freeman3"));
	}
	
	public void testNoSpecial() {
		assertFalse(UserAccount.isLastNameValid("micro$oft"));
	}

}
