package practice;

public class NumberPalindrome {

	public static void main(String[] args) {
		int no=12521;
		int rev=0;
		int temp=no;
		while(temp>0)
		{
			int rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(no==rev)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
