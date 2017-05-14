package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Candy {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Number of students");
        int n=input.nextInt();
        int[] rating=new int[n];
        int count=n;
        int sum=1;
        System.out.println("Enter the students Rating values");
        for(int i=0;i<n;i++)
        {
        	rating[i]=input.nextInt();
        }
        Arrays.sort(rating);
        for(int i=0;i<n-1;i++)
        {
        	if(rating[i]<rating[i+1])
        	{
        		count+=sum++;
        	}
        	
        }
		System.out.print("Minimum Chocolates required :"+count);
		input.close();
	}

}
