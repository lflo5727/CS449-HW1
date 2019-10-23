package acceptancetests;

import junit.framework.TestCase;
import business.UserAccountManager;

public class LoginTests extends TestCase{
	
	public void testValidLogin() {
		UserAccountManager userSetup = new UserAccountManager();
		userSetup.registerNewUser("onefreeman", "Vance3$", "Vance3$", "Gordon", "Freeman", "gfreeman@blackmesa.com", "7851234567");
		assertNotNull(userSetup.login("onefreeman", "Vance3$"));
		
	}
	
	public void testInvalidPassword() {
		UserAccountManager userSetup = new UserAccountManager();
		userSetup.registerNewUser("onefreeman", "Vance3$", "Vance3$", "Gordon", "Freeman", "gfreeman@blackmesa.com", "7851234567");
		assertNull(userSetup.login("onefreeman", "Vance3$@"));
	}
	
	public void testInvalidUsername() {
		UserAccountManager userSetup = new UserAccountManager();
		userSetup.registerNewUser("onefreeman", "Vance3$", "Vance3$", "Gordon", "Freeman", "gfreeman@blackmesa.com", "7851234567");
		assertNull(userSetup.login("onereeman", "Vance3$"));
	}
}
