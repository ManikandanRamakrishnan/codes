package Array;

import java.util.Scanner;

public class ZerosAndOnes {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Array Size");
        int n=input.nextInt();
        int[][] arr=new int[n][n];
        int[][] copy=new int[n][n];
        for(int i=0;i<n;i++){
        	for(int j=0;j<n;j++)
        	{
        		arr[i][j]=input.nextInt();
        		copy[i][j]=arr[i][j];
        	}
        }
        for(int i=0;i<n;i++){
        	for(int j=0;j<n;j++)
        	{
        		if(arr[i][j]==0)
        		{
        			for(int z=0;z<n;z++)
        			{
        				copy[z][j]=0;
        			}
        		}
        		if(arr[i][j]==0)
        		{
        			for(int z=0;z<n;z++)
        			{
        				copy[i][z]=0;
        			}
        		}
        	}
        }
        System.out.println("The output array is");
        for(int i=0;i<n;i++){
        	for(int j=0;j<n;j++)
        	{
            System.out.print(copy[i][j]+" ");
        	}
        	System.out.println();
        }
        input.close();
	}

}
