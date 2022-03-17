package logicString;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordsInString {

	public static void main(String[] args) {
		String s="yella bittu yenu illada haage badukiruva yenu illada haage badukiruva";
		String[] str = s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();// to maintain insertion order and to remove duplicates
		for (int i = 0; i < str.length; i++) {
			set.add(str[i]);
		}
		for (String words : set) { //no need of count
			System.out.print(words+" ");
				}
		
	}

}
