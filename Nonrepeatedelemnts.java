//package mani;

import java.util.Scanner;

public class Nonrepeatedelemnts {

	private static Scanner input;

	public static void main(String[] args) {
		int[] number=new int[100];
		input = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size=input.nextInt();
		System.out.println("Enter the elements of an array:");
		for(int k=0;k<size;k++)
		 number[k]=input.nextInt();
		for(int i=0;i<size;i++)
		{
			boolean ans=true;
		for(int j=0;j<size;j++)
		{
			if(number[i]==number[j]&&i!=j)
				ans=false;
		}
		if(ans)
			System.out.println(+number[i]);
			
		}
		

	}

}
