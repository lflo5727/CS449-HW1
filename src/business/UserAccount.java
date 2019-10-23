package business;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserAccount {
	
	private String userName;
	private String password;
	
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	
	public UserAccount() {	
	}
	
	public static String checkInputError(String userName, String password, String firstName, String lastName, String email, String phone){
		String errorMessage ="";
		if (!isUserNameValid(userName))
				errorMessage += "Invalid user name.\n";
		if (!isPasswordValid(password))
				errorMessage += "Invalid password.\n";	
		if (!isFirstNameValid(firstName))
			errorMessage += "Invalid first name.\n";
		if (!isLastNameValid(lastName))
			errorMessage += "Invalid last name.\n";
		if (!isEmailValid(email))
			errorMessage += "Invalid email.\n";
		if (!isPhoneNumberValid(phone))
			errorMessage += "Invalid phone number.\n";
		return errorMessage;
	}
	
	public String getUserName(){
		return userName;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	// you need to complete this method
	public static boolean isUserNameValid(String userName){
		// check if userName is valid	
		char[] chars = userName.toCharArray();
		
	    for (char c : chars) {
	        if(!Character.isLetter(c) & !Character.isDigit(c)) {
	            return false;
	        }
	    }
	    
	    if(Character.isUpperCase(chars[0])) {
	    	return false;
	    }
	    
		return true;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	

	// you need to complete this method
	public static boolean isPasswordValid(String password){
		// check if password is valid
		char[] chars = password.toCharArray();
		int charCount = 0;
		boolean hasDigit = false;
		boolean hasSpec = false;
		boolean hasUpper = false;
		boolean hasLower = false;

	    for (char c : chars) {
	    	charCount += 1;
	    	String specTest = String.valueOf(c);
	    	
	        if(Character.isDigit(c)) {
	            hasDigit = true;
	        }
	        if(specTest.matches("[@#$^&]")) {
	        	hasSpec = true;
	        }
	        if(Character.isUpperCase(c)) {
	        	hasUpper = true;
	        }
	        if(Character.isLowerCase(c)) {
	        	hasLower = true;
	        }
	        if(!Character.isLetter(c) & !Character.isDigit(c) & !(specTest.matches("[@#$^&]"))) {
	        	return false;
	        }
	    }
	    
	    if(charCount < 6) {
	    	return false;
	    }
	    
	    if(hasDigit & hasSpec & hasUpper & hasLower) {
	    	return true;
	    }
	    else {
	    	return false;
	    }
	}

    public boolean isValidCredential(String userName, String password) {
         return matchUserName(userName) && matchPassword(password);
    }
    
    public boolean matchUserName(String userName) {
         return userName != null && userName.equalsIgnoreCase(this.userName);
    }
    
    private boolean matchPassword(String password) {
        return password != null && password.equals(this.password);
   }

	public String getFirstName(){
		return firstName;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	// you need to complete this method
	public static boolean isFirstNameValid(String firstName){
		// check if firstName is valid
		char[] chars = firstName.toCharArray();

	    for (char c : chars) {
	        if(!Character.isLetter(c)) {
	            return false;
	        }
	    }
		
	    return true;	
		
	}
	
	public String getLastName(){
		return lastName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	// you need to complete this method
	public static boolean isLastNameValid(String lastName){
		// check if lastName is valid
		char[] chars = lastName.toCharArray();
		
		for (char c : chars) {
			if(!Character.isLetter(c)) {
				return false;
			}
		}
		return true;
	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String email){
		this.email = email;
	}

	// you need to complete this method
	public static boolean isEmailValid(String email){
		// check if email is valid
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	    return email.matches(regex);

	}

	public String getPhoneNumber(){
		return phone;
	}

	public void setPhoneNumber(String phone){
		this.phone = phone;
	}

	// you need to complete this method
	public static boolean isPhoneNumberValid(String phone){
		// check if phone (number) is valid
		Pattern pattern = Pattern.compile("\\d{3}\\d{7}");
		Matcher matcher = pattern.matcher(phone);
		
		if(matcher.matches()) {
			return true;
		}
		else {
			return false;
		}
	}


}
