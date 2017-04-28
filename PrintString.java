import java.util.Scanner;

public class PrintString {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter value");
		String str=input.nextLine();
		String s="";
		int j,number=0;
		for(int i=0;i<str.length();i++)
		{
			 j=i;number=0;
		while(j<str.length()&&Character.isDigit(str.charAt(j)))
		{
			number=number*10+Character.getNumericValue(str.charAt(j));
			j++;		
		}
		while(number>0)
		{
		s+=str.charAt(i-1);
		number--;
		}
		}
		System.out.println(s);
		input.close();

	}

}
