package sony;

public class ForGivenIpTellMeTheOp {
	
	 static int num1 = 6, num2 = 2;

	    interface FuncInterface {
	        int operation(int a, int b);
	    }

	public static void main(String[] args) {
		 FuncInterface add = (x, y) -> x + y;
	       FuncInterface sub = (x, y) -> x - y;
	       FuncInterface mul = (x, y) -> x * y;
	       FuncInterface div = (x, y) -> x / y;

	       System.out.print("Add is " + add.operation(num1, num2));
	       System.out.print("\t Sub is " + sub.operation(num1, num2));
	       System.out.print("\t Mul is " + mul.operation(num1, num2));
	       System.out.print("\t Div is " + div.operation(num1, num2));
	}

}
