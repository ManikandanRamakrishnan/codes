

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TallestStudent {

	public static void main(String[] args) {
		int number;
		Scanner input=new Scanner(System.in);
		ArrayList<Integer> height=new ArrayList<Integer>();
		System.out.print("Enter the  height of 50 members in a class");
		for(int i=0;i<50;i++)
		{
			number=input.nextInt();
			height.add(number);
		}
		Collections.sort(height);
		Collections.reverse(height);
		System.out.println(+height.get(3));
		System.out.print("Enter the k value");
		number=input.nextInt();
		number-=1;
		if(number>=0&&number<=50)
		System.out.println(+height.get(number));
		else
			System.out.println("Out of range");
		input.close();
	}

}
