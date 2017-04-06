

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	int i=1,fact=1;
	System.out.println("Enter a number :");
	Scanner input=new Scanner(System.in);
	int number=input.nextInt();
	while(i<number&&number!=0)
	{
	fact+=i*fact;
	i++;
	}
	System.out.println(+number+" Factorial = " +fact);
   input.close();

}
}