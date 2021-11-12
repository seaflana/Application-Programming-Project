package CustomerInformation;

import java.util.Scanner;

public class CustomerRegistration {
	
	public static void main(String[] args) {
		User user = new User();
		
		// First name creation
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String firstName = input1.nextLine();
		user.setUserFirstName(firstName);
		
		// Last name creation
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter your last name: ");
		String lastName = input2.nextLine();
		user.setUserLastName(lastName);
		
		// User address creation
		Scanner input3 = new Scanner(System.in);
		System.out.println("Enter your address: ");
		String userAddress = input3.nextLine();
		user.setUserAddress(userAddress);
		
		// User zipcode creation
		Scanner input4 = new Scanner(System.in);
		System.out.println("Enter your zipcode: ");
		int userZipcode = input4.nextInt();
		user.setUserZipcode(userZipcode);
		
		// User state creation
		Scanner input5 = new Scanner(System.in);
		System.out.println("Enter your state: ");
		String userState = input5.nextLine();
		user.setUserState(userState);
		
		// Username creation
		Scanner input6 = new Scanner(System.in);
		System.out.println("Enter username: ");
		String username = input6.nextLine();
		user.setUserUsername(username);
		
		// Password creation
		Scanner input7 = new Scanner(System.in);
		System.out.println("Enter password: ");
		String password = input7.nextLine();
		user.setUserPassword(password);
		
		// Email creation
		Scanner input8 = new Scanner(System.in);
		System.out.println("Enter an email address: ");
		String email = input8.nextLine();
		user.setUserEmail(email);
		
		// SSN creation
		Scanner input9 = new Scanner(System.in);
		System.out.println("Enter your SSN without hyphens: ");
		int ssn = input9.nextInt();
		user.setUserSSN(ssn);
		
		// Security question creation
		Scanner input10 = new Scanner(System.in);
		System.out.println("Enter a security question: ");
		String secQuestion = input10.nextLine();
		user.setUserSecQuestion(secQuestion);
		
		// Security answer creation
		Scanner input11 = new Scanner(System.in);
		System.out.println("Enter an answer to your security question: ");
		String secAnswer = input11.nextLine();
		user.setUserSecAnswer(secAnswer);
		
		
	}
}
