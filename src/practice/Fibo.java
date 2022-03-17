package practice;

public class Fibo {

	public static void main(String[] args) {
		int fib1=0;
		int fib2=1;
		int fib3=0;
		for (int i = 0; i <10; i++) {
			fib3=fib1+fib2;
			
			if(fib3<=21)
			{
				fib1=fib2;
				fib2=fib3;
				System.out.println(fib3);
			}
		}
	}

}
