


import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		System.out.println("Enter a String:");
		Scanner input=new Scanner(System.in);
		String Str=input.nextLine();
		String str2="";
		Str.toLowerCase();
		if(Str.length()>1){
		str2+=(Str.substring(0,1)).toUpperCase();
		for(int i=1;i<Str.length();i++)
		{
			if(Str.substring(i,i+1).equals(" ")){
			str2+=(Str.substring(i+1,i+2)).toUpperCase();
			i=i+1;
		}
			else if((Str.charAt(i))>='a'&&(Str.charAt(i))<='z'||(Str.charAt(i))>='A'&&(Str.charAt(i))<='Z')		
		str2+=(Str.substring(i,i+1));
		}
		}
		input.close();
	  System.out.println(str2);
	}

}
