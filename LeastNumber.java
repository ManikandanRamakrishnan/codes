

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LeastNumber {
	public static void main(String[] args) {
	ArrayList<Integer> number=new ArrayList<Integer>();
	Scanner input=new Scanner(System.in);
	int i=0,ans=0,check=0;
	System.out.print("Enter the a number");
	int digit=input.nextInt();
	if(digit<0)
	{
		digit*=-1;
		check=1;
	}
	while(digit>0){
	number.add(digit%10);
	digit/=10;
	i++;
	}
	Collections.sort(number);
	if(check==1)
	{
		Collections.reverse(number);
		ans=0;
	}
	System.out.print("Enter how many digit to be deleted");
	digit=input.nextInt();
	if(digit>=0&&digit<=i)
	{
	for(int j=0;j<i-digit;j++)
	{
	ans=ans*10+number.get(j);
	
	}
	if(check==1)
	{
		ans*=-1;
	}
	System.out.print("The least number is "+ans);
	}
	else
		System.out.print("Limit out of range");
	input.close();
	}
}
