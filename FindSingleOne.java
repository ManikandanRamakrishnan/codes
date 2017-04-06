
import java.util.Scanner;

public class FindSingleOne {

	public static void main(String[] args) {
		int[] a=new int[100];
		int i,count=0;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the size of an array ");
		int n=input.nextInt();
		System.out.print("Enter the array elements");
		for(i=0;i<n;i++){
		a[i]=input.nextInt();
		}
		input.close();
		for(i=0;i<n;i++)
		{
			count=0;
		for(int j=0;j<n;j++)
		{
			if(a[i]==a[j]&&i!=j){
				count++;
			}
		}
		if(count==0){
			System.out.println("The single one is= "+a[i]);
		break;
		}
		}

	}

}
