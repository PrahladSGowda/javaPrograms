package rayArray;

public class WithoutSorting {

	public static void main(String[] args) {
		int[] arr={10,54,15,87,65};
		int secmax=0;
		int firstmax=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>firstmax)
			{
				
				secmax=firstmax;
				firstmax=arr[i];
				
			}
			else if(arr[i]>secmax)
			{
				secmax=arr[i];
			}
		}
		System.out.println(firstmax);
		System.out.println(secmax);
	}

}
