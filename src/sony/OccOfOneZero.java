package sony;

import java.util.HashSet;

public class OccOfOneZero {

	public static void main(String[] args) {
		int[] arr={1,1,1,0,0,0,1,1};
		HashSet<Integer> set=new HashSet<Integer>();
for (int i = 0; i < arr.length; i++) {
	set.add(arr[i]);
}
for (Integer in : set) {
	int count=0;
	for (int i = 0; i < arr.length; i++) {
		if(in==arr[i])
		{
			count++;
		}
	}
	System.out.println(in+"-->"+count);
}
	}

}
