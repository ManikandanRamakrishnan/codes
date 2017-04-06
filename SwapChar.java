

import java.util.Scanner;

public class SwapChar {

	public static void main(String[] args) {
		System.out.println("Enter a String:");
		Scanner input=new Scanner(System.in);
		String Str=input.nextLine();
		StringBuffer s=new StringBuffer(Str);
		int length=Str.length();
		if(length%2==1)
		{
			length=length-1;
		}
		for(int i=0;i<length-1;i=i+2)
		{
		char a=s.charAt(i);
		s.setCharAt(i,s.charAt(i+1));
		s.setCharAt(i+1,a);
		}
		System.out.print(s);
		input.close();
	}

}
