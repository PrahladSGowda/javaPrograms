package practice;

public class PrimeNum {

	public static void main(String[] args) {
	int no=6;
	int i=2;
	while(i<=no)
	{
		if(no%i==0)
		{
			break;
		}
		else
		{
			i++;
		}
	}
	if(no==i)
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("no");
	}
	}
}
