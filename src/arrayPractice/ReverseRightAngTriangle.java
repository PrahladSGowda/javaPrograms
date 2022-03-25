package arrayPractice;

public class ReverseRightAngTriangle {

	public static void main(String[] args) {
		int n=5;
		for (int i =n; i>=1; i--) { //to create rows
			for (int j =2*(n-i); j>0; j--) { //to create required space
				System.out.print(" ");
			}
			for (int j =i; j>=1; j--) {//to print * in columns
				System.out.print("* ");
			}
			System.out.println(); //navigate to next line
		}
	}

}
