

import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		System.out.println("Enter the first String:");
		Scanner input=new Scanner(System.in);
		String Str=input.nextLine();
		System.out.println("Enter the second String :");
		String Str2=input.nextLine();
		input.close();
		int i,ans=0;
		int[] a=new int[26];
		int[] b=new int[26];
		if(Str.length()==Str2.length()){
		for(i=0;i<Str.length();i++)
		{
			a[Str.charAt(i)-'a']++;
			b[Str2.charAt(i)-'a']++;
		}
		for(i=0;i<26;i++)
		{
		if(a[i]!=b[i])
		{
			ans=1;
			break;
		}
		}
		}
		else
			ans=1;
		if(ans==0)
			System.out.println("Strings are Anagram");
		else
			System.out.println("Strings are not Anagram");
		
	}
	
}
