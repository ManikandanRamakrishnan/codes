package String;

import java.util.Scanner;

public class CheckSubstring {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the stringA");
        String stringA=input.nextLine();
        System.out.println("Enter the stringB");
        String stringB=input.nextLine();
        int ans=0;
        System.out.print("Output is ");
        if(stringA.length()>=2&&stringB.length()>=2){
        for(int i=0;i<=stringA.length()-2;i++)
        {
        	String str=stringA.substring(i,i+2);
        	if(stringB.contains(str))
        	{
        		System.out.println("True");
        		ans=1;
        		break;
        	}
        	
        }
        }
        if(ans==0)
        	System.out.println("False");
        input.close();
        	
	}

}
