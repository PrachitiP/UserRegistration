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
	
	
}
