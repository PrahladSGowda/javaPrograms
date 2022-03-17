package logicString;

import java.util.HashSet;

public class NumberOfOccurranceOfWords {

	public static void main(String[] args) {
		String s="ten eleven twelve thirteen fourteen fourteen";
		String[] str =s.split(" "); //to get word by word
		HashSet<String> set=new HashSet<String>();// input is string 
		for (int i = 0; i < str.length; i++) {
			set.add(str[i]);
		}
		for (String word : set) {
			int count=0;
			for (int i = 0; i < str.length; i++) {
				if(word.equals(str[i]))
				{
					count++;
				}
			}
			System.out.println(word+" "+count);
		}

	}

}
