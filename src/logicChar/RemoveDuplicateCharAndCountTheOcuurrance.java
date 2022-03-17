package logicChar;

import java.util.HashSet;

public class RemoveDuplicateCharAndCountTheOcuurrance {

	public static void main(String[] args) {
		String s="polymorphism";
		HashSet<Character> set=new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character ch : set) {
			int count=0;
			for (int i = 0; i < s.length(); i++) {
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			System.out.println(ch+"-->"+count);
			}
			
		}

	}
