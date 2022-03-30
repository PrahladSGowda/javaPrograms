package sony;


public class NearestPalindrome {
public static int rev;
public static int rev1;
public static int a=18;
public static int temp=18;

	public static void palindromeNegetive(int n)
	{
		int temp=n;
		rev=0;
		while(temp>0)
		{
			int rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(rev==n)
		{
//			//System.out.println(rev+"-->palindrome");
//			int diff=a-rev;
//			//System.out.println(diff);
		}
		else
		{
			n--;
			palindromeNegetive(n);
		}
	}
	
	

	public static void palindromePositive(int n)
	{
		int temp=n;
		rev1=0;
		while(temp>0)
		{
			int rem=temp%10;
			rev1=rev1*10+rem;
			temp=temp/10;
		}
		if(rev1==n)
		{
//			//System.out.println(rev1+"-->palindrome");
//			int diff1=rev1-a;
//			//System.out.println(diff1);
		}
		else
		{
			n++;
			palindromePositive(n);
		}
	}	
	public static void main(String[] args) {
		palindromeNegetive(temp);
		palindromePositive(temp);
		if(a-rev<rev1-a)
		{
			System.out.println(rev+"-->is the nearest palindrome");
		}
		else
		{
			System.out.println(rev1+"-->is the nearest palindrome");
		}
		
	}
}

