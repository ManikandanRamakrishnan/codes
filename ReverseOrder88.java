package GUVI;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class ReverseOrder88 {

	public static void main(String[] args) {
		LinkedHashSet<Character> chr=new LinkedHashSet<Character>();
		Scanner input=new Scanner(System.in);
		StringBuffer  str=new StringBuffer(input.next());
		str=str.reverse();
		for(int i=0;i<str.length();i++){
			if(chr.add(str.charAt(i))){
				System.out.print(str.charAt(i));
			}
		}
input.close();
	}

}
