package Array;
import java.util.Scanner;

public class RemoveElement {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Array Size");
        int n=input.nextInt();
        int[] number=new int[n];
        int j=0;
        System.out.println("Enter array elements");
       
        for(int i=0;i<n;i++)
        {
        	number[i]=input.nextInt();
        }
        System.out.println("Enter the element To be removed");
        int k=input.nextInt();
        for(int i=0;i<n;i++)
        {
        if(number[i]==k)
        {
        	j=i;
        	while(j<n-1)
        	{
        	number[j]=number[j+1];
        	j++;
        	}
        	n--;
         i=-1;
        
        }
        }
        System.out.println("The result is");
        for(int i=0;i<n;i++)
        {
        System.out.print(number[i]+" ");
        }
        input.close();

	}

}
