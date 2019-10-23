package acceptancetests;

import junit.framework.TestCase;
import business.UserAccountManager;

public class RegisterNewUserTests extends TestCase{
	
	public void testPasswordsMatch() {
		UserAccountManager userSetup = new UserAccountManager();
		String result = userSetup.registerNewUser("sgtJohnson", "pop32$$", "pop32@$$", "Avery", "Johnson", "ajohnson@unsc.gov", "8164135117");
		assertEquals("Passwords do not match.\n", result);
		
	}
	
	public void testValidUsername() {
		UserAccountManager userSetup = new UserAccountManager();
		String result = userSetup.registerNewUser("sgtJohnson", "pop32$$", "pop32$$", "Avery", "Johnson", "ajohnson@unsc.gov", "8164135117");
		assertEquals("", result);
	}
	
	public void testExistingUser() {
		UserAccountManager userSetup = new UserAccountManager();
		userSetup.registerNewUser("sgtJohnson", "pop32$$", "pop32$$", "Avery", "Johnson", "ajohnson@unsc.gov", "8164135117");
		String result = userSetup.registerNewUser("sgtJohnson", "chief7@@", "chief7@@", "Master", "Chief", "s117@unsc.gov", "8169135117");
		assertEquals("Username already exists.\n", result);
	}
	
}
