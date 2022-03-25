package sony;

public class PrimeNumFrom1To100 
{

	public static void main(String[] args) 
	{
		for (int k = 2; k <=100; k++)
		{
	int no=k;
	boolean flag = true;
	for (int i = 2; i <k; i++)
	{
		if(no%i==0)
		{
			flag=false;
			break;
		}
	}
		if(flag==true)
		{
			System.out.println(no+"-->is prime");
		}
	}
}
}
