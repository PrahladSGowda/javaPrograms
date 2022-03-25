package sony;

public class ReverseFromHalf {

	public static void main(String[] args) {
		String s="javamava";
		String rev="";
		String s2=s.substring(4);
		System.out.println(s2);

		for (int i = s2.length()-1; i>=0; i--) {
			rev=rev+s2.charAt(i);
		}
		System.out.println(rev);
	}

}
