

import java.util.Scanner;

public class StringToInt {

	public static void main(String[] args) {
		System.out.println("Enter a String:");
		Scanner input=new Scanner(System.in);
		String Str=input.nextLine();
		int number=Integer.parseInt(Str);
		System.out.println("The converted integer is= "+number);
		input.close();

	}

}
