package Patterns;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int j;
		for(int i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			int k=j-2;
			while(k>=1){
				System.out.print(k--+" ");
			}
			System.out.println();
		}
input.close();
	}
}
