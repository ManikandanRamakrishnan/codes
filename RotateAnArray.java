

import java.util.Scanner;

public class RotateAnArray {

	public static void main(String[] args) {
		int[] a=new int[100];
		int i;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the size of an array ");
		int n=input.nextInt();
		int l=n;
		System.out.print("Enter the array elements");
		for(i=0;i<n;i++){
		a[i]=input.nextInt();
		}
		System.out.print("Enter the k value ");
		int k=input.nextInt();
		for(i=n-1;i>=0;i--)
		{
			a[i+k]=a[i];	
		}
		for(int j=0;j<k;j++)
		{
			a[j]=a[l++];
		}
		for(i=0;i<n;i++)
		{
			System.out.print(" "+a[i]);
		}
		
input.close();
	}

}
