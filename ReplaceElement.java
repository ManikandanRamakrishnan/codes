package GUVI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReplaceElement {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of thae array");
		int n=input.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			arr.add(input.nextInt());
		}
		System.out.println("Output:");
        for(int j=0;j<n-1;j++)
        {
        arr.remove(0);
        System.out.print(Collections.max(arr)+" ");
        }
		 System.out.print(0);
		input.close();

	}

}
