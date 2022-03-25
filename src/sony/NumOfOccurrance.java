package sony;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class NumOfOccurrance {

	public static void main(String[] args) {
		String s="wwwwprreetrtw";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		//HashSet<Character> set=new HashSet<Character>();
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
		else
		{
			for (int j = s.charAt(i); j < s.length(); j++) {
				if(ch==s.charAt(i))
				{
					System.out.println(ch+" "+count);
				}
			}
			break;
		}
		
	}
	
	System.out.print(ch+""+count);
}
	}

}
