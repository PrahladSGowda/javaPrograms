package rayArray;

public class AddFirst3Max {
	public static void main(String[] args) {
		int [] arr={10,5,8,3,6,9};
for (int i = 0; i < arr.length; i++) {
	for (int j = i+1; j < arr.length; j++) {
		if(arr[i]<arr[j])
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	System.out.print(arr[i]+" ");
}
	int sum=0;
	for (int j = 0; j <3; j++) {
		sum=sum+arr[j];
	}
	System.out.println(sum);
	}

}

