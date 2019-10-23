package unittests;

import business.UserAccount;
import junit.framework.TestCase;


public class PasswordTests extends TestCase {

	public void testValidPassword() {
		assertTrue(UserAccount.isPasswordValid("@White0House"));
	}
	
	public void testNeedSymbols() {
		assertFalse(UserAccount.isPasswordValid("Hyrule23"));
	}
	
	public void testNeedNumbers() {
		assertFalse(UserAccount.isPasswordValid("Hyrule@"));
	}
	
	public void testNeedUpper() {
		assertFalse(UserAccount.isPasswordValid("hyrule23@"));
	}
	
	public void testNeedLower() {
		assertFalse(UserAccount.isPasswordValid("HYRULE23@"));
	}
	
	public void testTooShort() {
		assertFalse(UserAccount.isPasswordValid("pO3@"));
	}
	
}
