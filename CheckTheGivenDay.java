

import java.util.Scanner;

public class CheckTheGivenDay {

	public static void main(String[] args) {
		System.out.println("Enter The Day:");
		Scanner input=new Scanner(System.in);
		String Str=input.nextLine();
		if(Str.equals("Sunday"))
		{
		System.out.println("False");	
		}
		else
			System.out.println("True");	
		input.close();

	}

}
