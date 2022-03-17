package logical;

public class Swap2IntegersWithout3rdVariable {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a-->"+a);
		System.out.println("b-->"+b);
		
		int c=15;
		int d=30;
		c=c+d;
		d=c-d;
		c=c-d;
		System.out.println(c);
		System.out.println(d);

	}

}
