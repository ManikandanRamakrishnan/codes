package Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumSumSubArray {

    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      ArrayList<Integer> list=new ArrayList<Integer>();
        int n=input.nextInt();
        int max=-9999999;
       int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<n;i++){
           int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum>max){
                    max=sum;
                    int k=i;
                    list.removeAll(list);
                    while(k<=j){
                    	list.add(arr[k++]);
                    }
                }
            }
        }
        System.out.println("Maximum sum subarry is:");
        for(int i:list){
        	System.out.println(i+" ");
        }
        System.out.println("Length is "+list.size());
       
    }

}
