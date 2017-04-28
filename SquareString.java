import java.util.Scanner;

public class SquareString {
	int findOneDigit(int number)
	{
		int ans=number;
		while(ans>9)
		{
			number=ans;
			ans=0;
			while(number>0)
			{
				ans+=number%10;
		      number/=10;
				
			}
			
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int max=0,min=11,mod=0;
		int ans=0,ans2=1;
		System.out.println("Enter value");
		String str=input.nextLine();
	    int j=0,i=0;
		int[] count=new int[str.length()];
		for(i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
			mod=Character.getNumericValue((str.charAt(i)));
			count[j]=mod;
			if(mod>max)
			{
				max=mod;
			}
			if(mod<min)
			{
				min=mod;
			}
			j++;
			}
			
		}
			for(i=0;i<j;i++)
			{
			ans+=max*count[i];	
			ans2*=min+count[i];		
			}
			//System.out.println(ans+" "+ans2);
			SquareString Calculate=new SquareString();
			max=Calculate.findOneDigit(ans);
			min=Calculate.findOneDigit(ans2);
			//System.out.println(max+" "+min);
			max=max<min?(max*max):(min*min);
			System.out.println("The answer is = "+max);
			input.close();
	}
}
