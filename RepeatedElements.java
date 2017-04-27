import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RepeatedElements {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Set<Integer> set=new HashSet<>();
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
