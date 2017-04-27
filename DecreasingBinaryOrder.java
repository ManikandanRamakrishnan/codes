
import java.util.Scanner;

public class DecreasingBinaryOrder {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int count=0,k;
		int[] number=new int[100];
		System.out.println("Enter n");
		int n=input.nextInt();
		
		System.out.println("Enter The Elements");
		for(int i=0;i<n;i++)
		{
		 number[i]=input.nextInt();
		}
		int[] count1=new int[n];
		for(int i=0;i<n;i++)
		{
			count=0;
			k=number[i];
			while(k>0)
			{
				if(k%2==1)
				{
					count++;
				}
				k/=2;
			}
		count1[i]=count;	
		}
	for(int i=0;i<n;i++)
		{
		for(int j=i+1;j<n;j++){
			if(count1[i]<count1[j])
			{
				int temp=number[i];
				number[i]=number[j];
				number[j]=temp;
				temp=count1[i];
				count1[i]=count1[j];
				count1[j]=temp;
			}
			else if(count1[i]==count1[j]){
				if(number[i]<number[j]){
			    int temp=number[i];
				number[i]=number[j];
				number[j]=temp;
				temp=count1[i];
				count1[i]=count1[j];
				count1[j]=temp;
				}
			}
		}
	}System.out.println("The output is");
			for(int i=0;i<n;i++)
			{
				System.out.println(number[i]);	
			}
			input.close();
		}
		}

	

