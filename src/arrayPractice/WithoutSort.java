package arrayPractice;

public class WithoutSort {

	public static void main(String[] args) {
		int[] arr={10,54,21,12,45,87};
		int fmax=0;
		int smax=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>fmax)
			{
				smax=fmax;
				fmax=arr[i];
			}
			else if(arr[i]>smax)
			{
				
				smax=arr[i];
			}
		}
		System.out.println(fmax+"and"+smax);
	}

}
