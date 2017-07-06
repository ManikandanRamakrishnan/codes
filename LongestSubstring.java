package String;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class LongestSubstring {
	Boolean findRepeat(String str)
	{
		LinkedHashSet<Character> s=new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++){
		if(!s.add(str.charAt(i)))
		{
			return false;
		}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		LongestSubstring find=new LongestSubstring();
		int length=0,max=0;
		int start=0,end=0;
		System.out.println("Enter String");
		String str=input.nextLine();
		for(int i=0;i<str.length();i++)
		{
		for(int j=i+1;j<=str.length();j++)
		{
	    String sub=str.substring(i,j);	
	    length=sub.length();
	    if(length>max&&find.findRepeat(sub))
	    {
	    	start=i;
	    	end=j;
	    	max=length;
	    }
	    else if(!(find.findRepeat(sub))){
		break;
		}
		}
	}
		System.out.print("The answer is ");
		System.out.print(str.substring(start,end)+",the length is "+(str.substring(start,end)).length());
		input.close();

	}


	}
