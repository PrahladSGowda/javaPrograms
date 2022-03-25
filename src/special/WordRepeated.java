package special;

public class WordRepeated {

	public static void main(String[] args) {
		String[] arr={"Test","MyTester","IsteSTing","india","Delhi","Test","SmarTEst"};
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].toLowerCase().contains("test"))
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
