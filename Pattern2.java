package Patterns;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int m=n;
		int n1=n*2-1;
		for(int i=1;i<=n1;i++){
			int k=i<=n?m--:i-n+1;
			for(int j=1;j<=k;j++){
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
input.close();
	}
}
