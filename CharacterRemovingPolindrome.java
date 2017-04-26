
import java.util.Scanner;

public class CharacterRemovingPolindrome {

	public static void main(String[] args) {
		String original;
		int ans=0,changed=0;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the String");
		original=input.nextLine();
		if(original.length()==1){
			System.out.println("Already palidromre");
		}
		else{
		for(int i=0;i<original.length();i++)
		{
			StringBuffer palin=new StringBuffer("");
			for(int j=0;j<original.length();j++)
			{
				if(i!=j){
				palin.append(original.charAt(j));
				}
				
			}
			String str=palin.toString();
			palin=palin.reverse();
			if(str.equals(palin.toString()))
			{
		    ans=i;
		changed=1;
			}
		}
		if(changed==1)
		System.out.printf("The character ‘%c’ at index %d should be removed to become a palindrome",original.charAt(ans),ans);
		else
			System.out.println("Not posible");
		}
		input.close();

	}

}
