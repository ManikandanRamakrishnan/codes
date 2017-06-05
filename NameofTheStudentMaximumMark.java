package GUVI;

import java.util.ArrayList;
import java.util.Scanner;

public class NameofTheStudentMaximumMark {

	public static void main(String[] args) {
		ArrayList<String> str=new ArrayList<String>();
		int max=-9999999;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of student");
		int n=input.nextInt();
		String name="";
		for(int i=0;i<n;i++)
		{
			System.out.printf("Enter student %d marks\n",i+1);
			str.add(input.next());
			String stringarray[]=str.get(i).split("#");
			try{
			int total=Integer.parseInt(stringarray[1])+Integer.parseInt(stringarray[2])+Integer.parseInt(stringarray[3]);
			if(total>max)
			{
				max=total;
				name=stringarray[0];
			}
			}
			catch(Exception e)
			{
				System.out.println("The input format should be name#mark1#mark2#mark3");
			}
		}
	System.out.println("Output:"+name);
	input.close();
	}

}
