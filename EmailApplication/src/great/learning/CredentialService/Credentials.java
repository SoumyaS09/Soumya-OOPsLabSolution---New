package great.learning.CredentialService;

import java.util.Random;

import great.learning.Employee.*;

public class Credentials {

	public String generatePassword(int length) 
	{
		String allChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%&*<:<>=+";
		String password= "";
		Random randomNum = new Random();
		
		int charLen = allChar.length();
		for (int i = 0; i < length; i++) {
			int nextNumber = randomNum.nextInt(charLen);
			password = password + allChar.charAt(nextNumber);
		}
		return password;
	}
	
	public String generateEmailId(String firstName, String lastName, String departmentName) 
	{
		String generateEmailId = firstName + lastName + "@" + departmentName + ".abc.com";
		return generateEmailId;
	}		
		
	public void show_Credentials(Data employeeObject, String generateEmailId, String generatePassword) 
	{
		
		System.out.println("Dear " + employeeObject.getFirstName() + " your credentials are as follows");
		System.out.println("Your generated Email Id is:  " + generateEmailId);
		System.out.println("Your password is: " + generatePassword);		
	}
}
	

