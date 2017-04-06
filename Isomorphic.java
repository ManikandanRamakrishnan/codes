

import java.util.Scanner;

public class Isomorphic {

	public static void main(String[] args) {
		Boolean ans=true;
		System.out.println("Enter the String1:");
		Scanner input=new Scanner(System.in);
		String Str=input.nextLine();
		System.out.println("Enter the String2:");
		String Str2=input.nextLine();
		for(int i=0;i<Str.length();i++)
		{
		for(int j=0;j<Str.length();j++){
		if(Str.charAt(i)==Str.charAt(j))
		{
			if(Str2.charAt(i)!=Str2.charAt(j)){
			ans=false;
			break;
			}
		}
		}
		if(ans==false)
		break;	
		}
       if(ans)
       {
    	   System.out.println("True");
       }
       else
    	   System.out.println("False");  
       input.close();
	}

}
