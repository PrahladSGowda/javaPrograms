package logicChar;

public class PrintYourNameWithoutLoop {
	public static void Times(int s)
	{
			if(s>0)
			{
				System.out.println("prahlad"+s);
				s--;
				Times(s);
			}
			
	}

	public static void main(String[] args) {
		Times(100);

	}

}
