

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the number");
		int number=input.nextInt(),count=0;
		int duplicate=number,ans=0;
		while(number>0)
		{
		number/=10;
		count++;
		}
		number=duplicate;
		while(true)
		{
			ans=0;
		while(number>0)
		{
		ans+=(int) Math.pow((number%10),count);	
		number/=10;
		}
		if(ans==1){
			break;
		}
		else
			number=ans;
		}
		if(ans==1){
			System.out.println("Happy number");
		}
			
input.close();
	}

}
