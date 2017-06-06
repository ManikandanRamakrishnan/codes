package GUVI;

import java.util.ArrayList;
import java.util.Scanner;

public class ImmediateNext {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of thae array");
		int n=input.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			arr.add(input.nextInt());
		}
		System.out.println("Output:");
		for(int i=0;i<n-1;i++)
		{
			if(arr.get(i)>arr.get(i+1))
			{
				System.out.print(arr.get(i+1)+" ");
			}
			else
				System.out.print("-1 ");
		}
		System.out.print("-1");
	
      input.close();
	}

}
