package sony;

public class RevEachWordInString {

	public static void main(String[] args) {
		String s="My Name is dash";
		String[] sep = s.split(" ");
		for (int i =sep.length-1; i>=0; i--) {
			 String word = sep[i];
			String rev="";
			for (int j=word.length()-1; j>=0; j--) {
			rev=rev+word.charAt(j);	
			}
			System.out.print(rev+" ");
		}

	}

}
