

import java.util.Scanner;

public class EqualIndex {
	static Scanner input=new Scanner(System.in);
     int findEqual(int n){
    	 int[] number=new int[100];
    	 int i,ans=0;
    	 System.out.println("Enter the array elements:");
    		for(i=0;i<n;i++){
    		number[i]=input.nextInt();
    		if(number[i]==i)
    		ans=i;
    		}
    		input.close();
    		System.out.printf("The number %d equals its index %d",ans,ans);
  
    	 return ans;
     }

	public static void main(String[] args) {
	
	int n;
	System.out.println("Enter the array size:");
	n=input.nextInt();
	EqualIndex output=new EqualIndex();
	output.findEqual(n);

	}

}
