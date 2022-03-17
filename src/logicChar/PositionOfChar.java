package logicChar;

import java.util.HashSet;

public class PositionOfChar {

	public static void main(String[] args) {
		String s="HaRiShA";
		s=s.toLowerCase();
		HashSet<Character> set=new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character ch : set) {
			for (int i = 0; i < s.length(); i++) {
				if(ch==s.charAt(i))
				{
					System.out.println(ch+" "+(i+1));
					break;
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
		System.out.println(ch+" "+(i+1));
		}
		String[] str = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]+" "+(i+1));
		}*/
	}

}
