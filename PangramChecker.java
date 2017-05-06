package String;

import java.util.Scanner;

public class PangramChecker {
	public static String pangramCheck(String str)
	{
		Character c;
		int totalcount=0;
		int[] charcount=new int[26];
		for(int i=0;i<str.length();i++)
		{
			 c=str.charAt(i);
			if(Character.isUpperCase(c))
			{
			c=Character.toLowerCase(c);	
			}
			if(Character.isLowerCase(c)){
				charcount[c-'a']++;
				if(charcount[c-'a']==1)
				{
					totalcount++;	
				}
			}
			
		}
		if(totalcount==26)
		return "Pangram";
		else
			return "Not pangram";
		
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string");
        String str=input.nextLine();
        System.out.print("Given string is ");
        if(str.length()>=26)
        System.out.print(pangramCheck(str));
        else
        	System.out.print("Not pangram");
        input.close();
        

	}

}
