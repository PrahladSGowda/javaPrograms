package logicChar;

import java.util.HashSet;


public class PosOfCharFromLast {
public static void main(String[] args) {
	String s="HaRiShA";
	s=s.toLowerCase();
	HashSet<Character> set=new HashSet<Character>();
	for (int i = 0; i < s.length(); i++) {
		set.add(s.charAt(i));
	}
	for (Character ch : set) {
		for (int i =s.length()-1; i>=0 ; i--) {
			if(ch==s.charAt(i))
			{
				System.out.println(ch+" "+(i+1));
				break;
			}
		}
	}
}
}
