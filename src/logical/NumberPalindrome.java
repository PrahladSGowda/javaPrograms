package logical;

public class NumberPalindrome {

	public static void main(String[] args) {
		int no=12345;
		int rev=0;
		int temp=no;
		while(temp>0)
		{
			int rem=temp%10;
			rev=(rev*10)+rem;
			temp=temp/10;
			
		}
		System.out.println(rev);
		if(no==rev)
		{
			System.out.println(no+"="+rev);
		}
		else
		{
			System.out.println("no");
		}
	}

}
