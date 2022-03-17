package special;

public class SeparateAllZerosFromGivenArray {

	public static void main(String[] args) {
		int a[]={3,0,1,0,0,2,0};
		int b[]=new int[a.length];
		int m=0;//int m=b.length-1;
		int n=b.length-1;//int n=0;
		for (int i = 0; i < b.length; i++) {
			if(a[i]==0)
			{
				b[n]=a[i];
				n--;//n++;
			}
			else
			{
				b[m]=a[i];
				m++;//m--;
			}
			
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}

	}

}
