package String;

import java.util.Scanner;

public class FindSubstring {

	public static void main(String[] args) {
		String str,sub;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the String1");
		str=input.nextLine();
		System.out.print("Enter the String2");
		sub=input.nextLine();
		int length=str.length()-sub.length();
		int index=-1;
		for(int i=0;i<=length;i++)
		{
			if(str.substring(i,i+sub.length()).equals(sub))
					{
				    index=i;
				    break;
					}
			
		}
		System.out.print(index);
		input.close();

	}

}
