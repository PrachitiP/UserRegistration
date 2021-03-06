package BridgeLabz.UserRegistration;
import java.util.*;
import java.util.regex.Pattern;

public class UserRegistartion {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		UserRegistartion u = new UserRegistartion();
		System.out.println("Enter First Name:");
		String fName = sc.nextLine();
		u.firstName(fName);
		
		System.out.println("Last Name");
		String lName = sc.nextLine();
		u.lastName(lName);
		
		System.out.println("Enter email id");
		String email = sc.nextLine();
		u.Email(email);
		
		System.out.println("Enter Phone number");
		String phNumber = sc.nextLine();
		u.PhoneNumber(phNumber);
		sc.close();
	}
	
	/*UC1*/
	public void firstName(String str)
	{
		String regexforFirstName = "^[A-Z]{1}[a-zA-Z]{2,}$";
		if(Pattern.matches(regexforFirstName, str))
		{
			System.out.println("First Name is valid");
		}
		else
		{
			System.out.println("First Name is invalid");
		}
	}
	
	/*UC2*/
	public void lastName(String str)
	{
		String regexforLastName = "^[A-Z]{1}[a-zA-Z]{2,}$";
		if(Pattern.matches(regexforLastName, str))
		{
			System.out.println("Last Name is valid");
		}
		else
		{
			System.out.println("Last Name is invalid");
		}
		
	}
	
	/*UC3*/
	public void Email(String str)
	{
		String regexforEmail = "^([a-zA-Z]{3,}([.|_|+|-]?[a-zA-Z0-9]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.]?[a-zA-Z]{2,3})?)$";
		if(Pattern.matches(regexforEmail, str))
		{
			System.out.println("Email is valid");
		}
		else
		{
			System.out.println("Email is invalid");
		}

	}
	
	/*UC4*/
	public void PhoneNumber(String str)
	{
		String regexforPhNumber = "^[91 ]{3}[7-9]{1}[0-9]{9}$";
		if(Pattern.matches(regexforPhNumber, str))
		{
			System.out.println("Phone number is valid");
		}
		else
		{
			System.out.println("Phone number is invalid");
		}

	}
	
	
	
}
