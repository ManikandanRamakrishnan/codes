package String;

import java.util.Scanner;

public class ReverseOrderOfWords {
	public static String reverseByWord(String str){
		String[] str1=str.split(" ");
		String ans="";
		for(int i=0;i<str1.length;i++){
			StringBuffer rev=new StringBuffer(str1[i]);
			ans+=rev.reverse().toString()+" ";
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter string");
        String str=input.nextLine();
        System.out.println(reverseByWord(str));
        input.close();

	}

}
