package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ElephantWeight {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number of elephants");
        int n=input.nextInt();
        int sum=0;int count=0;
        System.out.println("Enter web size");
        int webweight=input.nextInt();
        int[] weight=new int[n];
        System.out.println("Enter elephants weight");
        for(int i=0;i<n;i++)
        {
        	weight[i]=input.nextInt();
        }
        Arrays.sort(weight);
        for(int i=0;i<n;i++)
        {
        if(sum+weight[i]<=webweight)
    	{
    		sum+=weight[i];
    		count++;
    	}
        }
        System.out.println("Output "+count);
        input.close();

	}

}
