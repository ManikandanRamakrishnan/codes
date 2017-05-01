package Array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MaximumSubarray {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Array Size");
		ArrayList<Integer> maximum=new ArrayList<Integer>();
        int n=input.nextInt();
        int[] number=new int[n];
        int max=-99999999;
        int i,j;
        System.out.println("Enter Array Elememts");
        for(i=0;i<n;i++){
        number[i]=input.nextInt();
        }
        for( i=0;i<n;i++)
        {
        	int sum=number[i];
        	int k=i;
        	for( j=i+1;j<n;j++)
        	{
        	sum+=number[j];
        	if(sum>max)
        	{
        		max=sum;
        		maximum.clear();
        		while(k<=j){
        			maximum.add(number[k]);
        			k++;
        	}
        	}
        	
        		
        		}
 
        }
        Iterator<Integer> id=maximum.iterator();
        System.out.print("Maximum sum subarray is ");
        while(id.hasNext()){
        	System.out.print(+id.next()+" ");
        	
        }
        input.close();

	}

}
