package unittests;

import business.UserAccount;
import junit.framework.TestCase;


public class UserNameTests extends TestCase {

	public void testValidUserName() {
		assertTrue(UserAccount.isUserNameValid("admin"));
	}

	public void testNoUpperFirst() {
		assertFalse(UserAccount.isUserNameValid("Admin"));
	}
	
	public void testNoSpaces() {
		assertFalse(UserAccount.isUserNameValid("admin space"));
	}
	
	public void testNoSpecial() {
		assertFalse(UserAccount.isUserNameValid("admin$"));
	}
	
	public void testCanHaveNumber() {
		assertTrue(UserAccount.isUserNameValid("admin31"));
	}
}
