package great.learning.Employee;

import java.util.Scanner;
import great.learning.CredentialService.*;


public class NewHireCredentials 
{
	
	public static void main (String[]args) 
	{
		Scanner scan= new Scanner(System.in);
	
		System.out.println("Welcome to ABC Global Service!");
		System.out.println();
	
		System.out.println("Enter your First name: ");
		String firstName= scan.next();
		
		System.out.println("Enter your Last name: ");
		String lastName= scan.next();
	
		System.out.println("Please select your department ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. HR");
		System.out.println("4. Legal");
		System.out.println("5. Logout");
	
		int option = scan.nextInt();
		scan.close();
		
		String departmentName = "";
		switch(option) {
	
		case 5:
			break;
			
		case 1:
			departmentName = "Technical";
			break;
			
		case 2: 
			departmentName= "Admin";
			break;
			
		case 3:
			departmentName= "HR";
			break;
			
		case 4:
			departmentName= "Legal";
			break;
			
		default:
			System.out.println("Please enter the valid option !");
		}

		Data dataobject = new Data (firstName, lastName);
		Credentials credentialService = new Credentials();
		
		String emailId = credentialService.generateEmailId(firstName,lastName, departmentName);
		String password = credentialService.generatePassword(8);
		
		credentialService.show_Credentials(dataobject, emailId , password);
		
	}

}