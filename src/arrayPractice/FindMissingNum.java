package arrayPractice;

public class FindMissingNum {

	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,7,8,9,10};
		int n=1;
		for (int i = 0; i < arr.length; i++) {
			n++;
		}
		int sumOfDigits=n*(n+1)/2;
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		int missingNum=sumOfDigits-sum;
		System.out.println("missing number is-->"+missingNum);
		
	}

}
