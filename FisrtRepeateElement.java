

import java.util.Scanner;

public class FisrtRepeateElement {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		 int[] number=new int[100];
    	 int i,n,ans=0,j=0;
    	 System.out.println("Enter the array size:");
    		n=input.nextInt();
    	 System.out.println("Enter the array elements:");
    		for(i=0;i<n;i++){
    		number[i]=input.nextInt();
    		}
    		for(i=0;i<n;i++){
    			for(j=i+1;j<n;j++)
        		if(number[i]==number[j]){
        			System.out.println("The fisrtrepeating elements is :"+number[i]);
        			ans++;
        			break;
        		}
    			if(ans>0)
    				break;
        		}
    		if(ans==0)
    			System.out.println("No repeating elements:");
    		input.close();

	}

}
