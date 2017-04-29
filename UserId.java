package String;

import java.util.Scanner;

public class UserId {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String userid="";
		String small,large;
		System.out.println("Enter First name");
		String firstname=input.nextLine();
		System.out.println("Ente Second name");
		String lastname=input.nextLine();
		System.out.println("Ente Pin");
		String pin=input.nextLine();
		System.out.println("Enter N");
		int n=input.nextInt();
		n=n-1;
		if(firstname.length()>lastname.length())
		{
		large=firstname;
		small=lastname;
		}
		else if(firstname.length()<lastname.length())
		{
		large=lastname;
		small=firstname;
		}
		else
		{
			if(firstname.compareTo(lastname)>0)
			{
				large=firstname;
				small=lastname;
			}
			else{
				large=lastname;
				small=firstname;
			}
				
		}
		try{
        userid=large.charAt(0)+small+pin.charAt(n)+pin.charAt((pin.length()-n)-1);
		}
		catch(Exception e)
		{
			System.out.println("I assumed that N is in the PIN range (Enter valid Range)");
			
		}
		String ans="";
		for(int i=0;i<userid.length();i++)
		{
			if(Character.isLowerCase(userid.charAt(i)))
			{
				ans+=Character.toUpperCase(userid.charAt(i));
			}
			else if(Character.isUpperCase(userid.charAt(i)))
			{
				ans+=Character.toLowerCase(userid.charAt(i));
			}
			else
			{
				ans+=userid.charAt(i);
			}
		}
        System.out.println(ans);
        input.close();
	}

}
