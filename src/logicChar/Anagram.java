package logicChar;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String s1="abcd";
	String s2="cdab";
	char[] arr1 = s1.toCharArray();
	char[] arr2 = s2.toCharArray();
	if(s1.length()==s2.length())
	{
		Arrays.sort(arr1);
		System.out.println(arr1);
		Arrays.sort(arr2);
		System.out.println(arr2);
		if(Arrays.equals(arr1, arr2))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("not a Anagram");
		}
	}
	else
	{
		System.out.println("not a Anagram");
	}
}
}
