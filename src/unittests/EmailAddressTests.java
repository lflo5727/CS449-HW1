package unittests;

import business.UserAccount;
import junit.framework.TestCase;


public class EmailAddressTests extends TestCase {

	public void testValidEmailAddress() {
		assertTrue(UserAccount.isEmailValid("don.smith@gmail.com"));
	}
	
	public void testNoAt() {
		assertFalse(UserAccount.isEmailValid("philpfrygmail.com"));
	}

	public void testDoubleDots() {
		assertFalse(UserAccount.isEmailValid("charlesfinley@gmail..com"));
	}
	
	public void testNoSymbols() {
		assertFalse(UserAccount.isEmailValid("noemailhere"));
	}
	
	public void testNoDomain() {
		assertFalse(UserAccount.isEmailValid("ryder@mace"));
	}
	
}
