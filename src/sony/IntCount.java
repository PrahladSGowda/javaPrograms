package sony;

import java.util.LinkedHashSet;

public class IntCount {

	public static void main(String[] args) {
		int[] arr={1,2,5,6,2,1,6,5,5};
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
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
