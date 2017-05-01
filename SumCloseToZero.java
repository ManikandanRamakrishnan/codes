package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class SumCloseToZero {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int close=9999999;
		int start=0,end=0;
		//i assumed that the array size greater than one
		System.out.println("Enter Array Size");
        int n=input.nextInt();
        int[] number=new int[n];
        int i,j;
        System.out.println("Enter Array Elememts");
        for(i=0;i<n;i++){
        number[i]=input.nextInt();
        }
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++)
            {
            	int sum=number[i]+number[j];
            	sum=Math.abs(sum);
            	if(sum>0&&sum<close)
            	{
            		start=i;
            		end=j;
            		close=sum;
            	
            	}
            }
            }
        System.out.print("Two elements such that their sum is closest to zero is ");  
        System.out.println(+number[start]+" and "+number[end]);
        
        input.close();
	}

}
