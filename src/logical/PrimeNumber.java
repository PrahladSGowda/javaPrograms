package logical;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=6;
		int i=2;
		while(i<=n)
		{
			if(n%i==0)
			{
				break;
			}
			else
			{
				i++;
			}
		}
			if(n==i)
			{
				System.out.println("yes the given number "+n+" is a prime number");
			}
			else
			{
				System.out.println("no the given number "+n+" is a not prime number");
			}
		}

	}
