

import java.util.Scanner;

public class SeedNumber {

	public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			int ans=0;
			System.out.print("Enter x");
			int number=input.nextInt();
			System.out.print("Enter y");
			int seed=input.nextInt();
			int check=0;
			if(number<0)
			{
				number*=-1;
				check=1;
			}
			ans=number;
			int original=ans;
			while(number>0){
			ans*=number%10;
			number/=10;
			
			}
			if(check==1)
			{
			ans*=-1;
			}
			if(ans==seed)
			{
				System.out.printf("%d is seed of %d",original,seed);
			}else
			System.out.printf("%d is not seed of %d",original,seed);
			input.close();
			
		}

	}

