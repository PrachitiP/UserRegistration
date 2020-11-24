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
	
	
}
