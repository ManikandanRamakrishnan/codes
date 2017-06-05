package GUVI;
import java.util.ArrayList;
import java.util.Scanner;

public class TargetValue {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the size of the array");
		int n=input.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			arr.add(input.nextInt());
		}
		System.out.println("Enter the M value");
		int m=input.nextInt();
		System.out.println("Enter the Taget  number");
		int target=input.nextInt();
		if(m<=n){
		for(int i=0;i<m;i++)//m shound be in the of n
		{
			sum+=arr.get(i);
		}
		
		if(sum==target)
		{
			System.out.println("TRUE");
		}
		else
			System.out.println("FALSE");
		}
		else
		{
			System.out.println("LIMIT OVERFLOW");
		}
		input.close();

	}

}
