

import java.util.Scanner;

public class Numberpolindrome {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int ans=0;
		System.out.print("Enter a number");
		int number=input.nextInt();
		int check=0;
		
		if(number<0)
		{
			number*=-1;
			check=1;
		}
		while(number>0){
		ans+=number%10;
		number/=10;
		}
		number=ans;
		int original=number;
		ans=0;
		while(number>0){
			ans=ans*10+number%10;
			number/=10;
			}
		if(check==1)
		{
			ans*=-1;
			original*=-1;
		}
		if(ans==original)
		{
			System.out.print(" sum of digits of a given number is palindrome number");
		}
		else
			System.out.print(" sum of digits of a given number is not a palindrome number");
		input.close();
			
	}
}
