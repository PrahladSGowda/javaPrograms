package sony;

public class Pattern {

	public static void main(String[] args) {
		int n=5;
		for (int i =3 ; i>=1; i--) {
			for (int j = n; j>0; j--) {
				System.out.print("* ");
			}
			System.out.println();
			n=n-2;
		}
		int n1=3;
		for (int i =1 ; i<=2; i++) {
			for (int j = n1; j>0; j--) {
				System.out.print("* ");
			}
			System.out.println();
			n1=n1+2;
		}

	}

}
