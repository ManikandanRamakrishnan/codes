package Array;

import java.util.Scanner;

public class HourglassSum {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);   
		int m=1;
		int max=-9999999;
		System.out.println("Enter the number of rows and columns");
		int row=input.nextInt();
		int col=input.nextInt();
		int[][] arr=new int[row][col];
		int sum;
		    for(int i = 0; i < row;i++){
		       for(int j = 0; j < col; j++){
		          arr[i][j]=input.nextInt();
		       }
		    }
		        for(int i=0;i<row-2;i++){
		         for(int j= 0; j < col-2; j++){
		             sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]+arr[i+1][m++];
		             if(sum>max){
		                 max=sum;
		             }
		         }
		        m=1;
		        }

		    System.out.println("Output :"+max);
		    input.close();
		}


	}


