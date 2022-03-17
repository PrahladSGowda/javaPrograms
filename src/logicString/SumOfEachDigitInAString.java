package logicString;

import java.util.Scanner;

public class SumOfEachDigitInAString {

	public static void main(String[] args) {
		//String s="o2ne1tw3o2th4ree3";
		Scanner scr=new Scanner(System.in);
		System.out.println("enter a string to add numbers--->");
		String s = scr.next();
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>=48 && s.charAt(i)<=57)
			{
				sum=sum+s.charAt(i)-48;
			}
		}
		System.out.println(sum);
	}

}
