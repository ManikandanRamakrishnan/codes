

import java.util.Scanner;

public class MinsBtTimes {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int ans=0;
		System.out.println("Enter the First time(24hrs format)(press enter to enter mins):");
		int Tone=input.nextInt();
		System.out.print(".");
		int Mone=input.nextInt();
		System.out.println("Enter the Second time");
		int Ttwo=input.nextInt();
		System.out.print(".");
		int Mtwo=input.nextInt();
		Tone=(Tone*60)+Mone;
		Ttwo=(Ttwo*60)+Mtwo;
		if(Tone>Ttwo)
		ans=Tone-Ttwo;
		else
		ans=Ttwo-Tone;
		System.out.println("Min Between Two times = "+ans);
		input.close();
		
	}

}
