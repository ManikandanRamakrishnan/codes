import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;


public class RepeatedElements {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		ArrayList<Integer> number= new ArrayList<Integer>();
		System.out.println("Enter n");
		int n=input.nextInt();
		System.out.println("Enter registration numbers");
		for(int i=0;i<n;i++)
		{
			int k=input.nextInt();
			number.add(k);
		}
		System.out.println("The duplicate registration numbers are");
		for(int i=0;i<n;i++)
		{
			if(!set.add(number.get(i))){
				System.out.print(number.get(i)+" ");	
			}
		}
		input.close();

	}

}
