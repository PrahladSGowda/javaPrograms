package sony;

public class EquiTraianglePattern {

	public static void main(String[] args) {
		for (int i = 1; i <=4; i++) {
			String s="* ";
			for (int j =i; j <=4; j++) {
				System.out.print(s);
			}
			System.out.println(" ");
			if(i==1)
			{
			System.out.print(" ");
			}
			else if(i==2)
			{
				System.out.print("  ");
			}
		else
		{
			System.out.print("   ");
		}
		}
	}

}
