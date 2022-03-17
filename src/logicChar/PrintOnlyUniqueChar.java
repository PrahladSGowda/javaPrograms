package logicChar;

import java.util.HashSet;

public class PrintOnlyUniqueChar {

	public static void main(String[] args) {
		String s="uniquechar";
		HashSet<Character> set=new HashSet<Character>(); //to remove duplicates
		for (int i = 0; i < s.length(); i++) { // to add char in set one by one without duplicates
			set.add(s.charAt(i));
		}
		for (Character ch : set) { //to fetch one by one and compare with the given string
			int count=0;
			for (int i = 0; i < s.length(); i++) {
				if(ch==s.charAt(i)) //comparision
				{
					count++;
				}
			}
			if(count==1)//to print only duplicates
			{
				System.out.println(ch+"-->"+count);
			}
		}
		

	}

}

