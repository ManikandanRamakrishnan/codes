package Array;

import java.util.Scanner;

public class TargetNumber {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Array Size");
        int n=input.nextInt();
        int[] number=new int[n];
        System.out.println("Enter Target Number");
        int target=input.nextInt();
        System.out.println("Enter Array Elememts");
        for(int i=0;i<n;i++){
        number[i]=input.nextInt();
        }
        int ans=0;
        for(int i=0;i<n;i++){
        	for(int j=i+1;j<n;j++){
        	if(number[i]+number[j]==target)
        	{
        	ans=1;
        	System.out.printf("%d + %d gives target number %d",number[i],number[j],target);
        	break;
        	}
        	}
            }
        if(ans==0)
        	System.out.println("Not possible");
        
        input.close();
	}

}
