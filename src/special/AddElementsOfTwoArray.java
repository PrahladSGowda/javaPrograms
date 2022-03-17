package special;

public class AddElementsOfTwoArray {

	public static void main(String[] args) {
		int a[]={1,2,5,7};
		int b[]={7,6,5,5,6,4,3};
		int count=a.length;
		if(b.length>a.length)
		{
			count=b.length;
		}
for (int i = 0; i < count; i++) {
	try {
		System.out.println(a[i]+b[i]);
	} catch (Exception e) {
		if(a.length>b.length)
		{
		System.out.println(a[i]);
		}
		else
		{
			System.out.println(b[i]);
		}
	}
	
}
	}

}
