

import java.util.Scanner;

public class LongestPolindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int length=0,max=0;
		int start=0,end=0;
		StringBuffer palindrome=new StringBuffer();
		System.out.println("Enter String");
		String str=input.nextLine();
		for(int i=0;i<str.length();i++)
		{
		for(int j=i+1;j<=str.length();j++)
		{
	    String sub=str.substring(i,j);	
	    palindrome=new StringBuffer(sub);
	    String rev=palindrome.reverse().toString();
	    length=sub.length();
	    if(length>max&&sub.equals(rev))
	    {
	    	start=i;
	    	end=j;
	    	max=length;
	    }	
		}
		}
		System.out.println("The Longest polindrome is ");
		System.out.println(str.substring(start,end));
		input.close();

	}

}
