

import java.util.Scanner;

public class ReverseString {

	String Reverse(	String original)
	{

		StringBuilder str=new StringBuilder("");
        for(int i=original.length()-1;i>=0;i--)
        {
        	str.append(original.charAt(i));
        }
		original=str.toString();
		return original;

	}

	public static void main(String[] args) {
		String original;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the String");
		original=input.nextLine();
		ReverseString rev=new ReverseString();
		System.out.print("The Reverse string is "+rev.Reverse(original));
       input.close();
	}

}
