package arrayPractice;

public class Epattern {

	public static void main(String[] args) {
		int n=5;
		for (int i =1; i <=3; i++) {
			
			for (int j =1; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
			n=n-2;
		}
		int n1=3;
		for (int i = 1; i <=2; i++) {
			for (int j =1; j <=n1; j++) {
				System.out.print("* ");
			}
			System.out.println();
			n1=n1+2;
		}
	}

}
