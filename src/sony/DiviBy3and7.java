package sony;

public class DiviBy3and7 {

	public static void main(String[] args) {
		int n=100;
		for (int i = 1; i < n; i++) {
			if(i%3==0 && i%7==0)
			{
				System.out.println(i);
			}
		}

	}

}
