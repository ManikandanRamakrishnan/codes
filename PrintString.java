import java.util.Scanner;

public class PrintString {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter value");
		String str=input.nextLine();
		String s="";int k=0;
		int j,number=0;
		for(int i=0;i<str.length();i++)
		{
			 j=k=i;number=0;
		while(j<str.length()&&Character.isDigit(str.charAt(j)))
		{
			number=number*10+Character.getNumericValue(str.charAt(j));
			j++;
			i++;
		}
		k-=1;try{
		while(number>0)
		{
		s+=str.charAt(k);
		number--;	
		}
		}
		catch(Exception e)
		{
			System.out.println("i assumed that the string always strat with olny letters");	
		}
		}
		System.out.println("Answer is "+s);
		input.close();


	}
}
