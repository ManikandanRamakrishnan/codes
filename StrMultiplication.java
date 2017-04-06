

import java.util.Scanner;

public class StrMultiplication {
	public static void main(String[] args) {
	System.out.println("Enter the first String(number):");
	Scanner input=new Scanner(System.in);
	String Str=input.next();
	System.out.println("Enter the Second String(number):");
	String Str2=input.next();
	int num1=Integer.parseInt(Str);
	int num2=Integer.parseInt(Str2);
		if(num1>0&&num2>0){
	String ans=String.valueOf((num1*num2));
	System.out.println(ans);
		}
		else
		System.out.println("Not a non negative value and arbitrarily large");
		input.close();
	
}
}