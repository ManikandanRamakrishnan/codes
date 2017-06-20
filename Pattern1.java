package Patterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int m=1;
		int n=input.nextInt();
		for(int i=1;i<=n*2;i++){
			int k=i>n?n-m++:i;
			for(int j=1;j<=k;j++){
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
input.close();
	}

}
