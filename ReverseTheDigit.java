

import java.util.Scanner;

public class ReverseTheDigit {

	public static void main(String[] args) {
		int Reverse=0;
		System.out.println("Enter a number :");
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		while(number>0)
		{
        Reverse=Reverse*10+(number%10);
        number/=10;
		}
		System.out.println("The Reverse number is= " +Reverse);
	   input.close();

	}

}
