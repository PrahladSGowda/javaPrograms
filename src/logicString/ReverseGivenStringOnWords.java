package logicString;

public class ReverseGivenStringOnWords {

	public static void main(String[] args) {
		String s="one two three four five six";
		String[] str = s.split(" "); //to get word by word in String array
		for (int i =str.length-1; i>=0 ; i--) {
			System.out.print(str[i]+" ");
		}

	}

}
