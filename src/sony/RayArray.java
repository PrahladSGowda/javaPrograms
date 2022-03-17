package sony;

public class RayArray {

	public static void main(String[] args) {
		int[] arr={1,4,6,3,2,2,5,6,3};
		int[] arr1=new int[arr.length-2];
		for (int i = 0; i < arr.length-2; i++) {
			int sum=0;
			for (int j = i; j <=i+2; j++) {
				sum=sum+arr[j];
			}
			arr1[i]=sum;
			System.out.print(arr1[i]+" ");
		}
			int min=arr1[0];
			for (int j = 0; j < arr1.length; j++) {
				
				if(min>arr1[j])
				{
					min=arr1[j];
				}
				
			}
			System.out.println("min-->"+min);
		}
	}

