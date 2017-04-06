
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
	 Scanner input=new Scanner(System.in);
	 System.out.println("Enter the string");
	 String Original=input.nextLine();
	 StringBuffer reverse=new StringBuffer(Original);
	 String ans=reverse.reverse().toString();
	 System.out.println("The Reverse string is  "+ans);
	 input.close();

	}

}
