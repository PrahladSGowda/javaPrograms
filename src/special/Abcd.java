package special;

import java.util.HashSet;

public class Abcd {

	public static void main(String[] args) {
		String s="abcdabcdabcdabcd";
		//char[] str = s.toCharArray();
		HashSet<Character> set=new HashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
			
			}
	for (Character ch : set) {
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if (ch==s.charAt(i)) {
				
					count++;
			}
			if (count>=1) {
				System.out.print(s.charAt(i));
				System.out.print(s.charAt(i));
				System.out.print(s.charAt(i));
				System.out.print(s.charAt(i));
				System.out.println(" ");
				break;
		}	
	}


}
	}
}