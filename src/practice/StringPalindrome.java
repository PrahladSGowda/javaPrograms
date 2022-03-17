package practice;

public class StringPalindrome {

	public static void main(String[] args) {
		String s="ultapalta";
		String rev="";
		for (int i = s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(s.equals(rev))
{
	System.out.println("palindrome");
}
else
{
System.out.println("no not a palindrome");
}
	}

}
