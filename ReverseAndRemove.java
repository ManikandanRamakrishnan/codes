

import java.util.Scanner;

public class ReverseAndRemove {

	public static void main(String[] args) {
		System.out.println("Enter a String:");
		Scanner input=new Scanner(System.in);
		String Str=input.nextLine();
		StringBuffer reverse=new StringBuffer(Str);
		Str=reverse.reverse().toString();
		System.out.println("Output 1- "+Str);
		Str=Str.replaceAll("[aeiouAEIOU]","");
		System.out.println("Output 2- "+Str);
		input.close();

	}

}
