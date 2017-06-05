

import java.util.Scanner;

public class LargestDifferenceGap {
	public static int findIndex(int arr[])
	{
		int i=0,difference=0,max=0,pos=0;;
		for(i=0;i<arr.length-1;i++)
		{
			
			difference=Math.abs(arr[i]-arr[i+1]);
			if(difference>max)
			{
				max=difference;
				pos=arr[i]>arr[i+1]?i:i+1;
				
			}
		}	
		return pos;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int i;
		System.out.println("Enter the size of the array");
		int n=input.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements");
		for(i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
		}
		System.out.println("Output:"+findIndex(arr));
		input.close();
	}

}
