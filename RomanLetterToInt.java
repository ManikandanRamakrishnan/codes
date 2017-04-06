

import java.util.Scanner;

public class RomanLetterToInt {

	public static void main(String[] args) {
		System.out.println("Enter a RomanLetter:");
		Scanner input=new Scanner(System.in);
		String Str=input.next();
		int previous=0,current=0,ans=0;
		int length=Str.length();
		for(int i=length-1;i>=0;i--)
		{
		switch(Character.toUpperCase(Str.charAt(i)))
		{
		case 'I':
			previous=current;
			current=1;
			break;
		case 'V':
			previous=current;
			current=5;
			break;
		case 'X':
			previous=current;
			current=10;
			break;
		case 'L':
			previous=current;
			current=50;
			break;
	
		case 'C':
			previous=current;
			current=100;
			break;
		case 'D':
			previous=current;
			current=500;
			break;
		case 'M':
			previous=current;
			current=1000;
			break;		
		}
		if(current<previous)
			ans-=current;
			else
				ans+=current;

	}
		if(ans!=0)
		System.out.println(+ans);
		else
			System.out.println("Invalid");	
		input.close();
	}
	


}
