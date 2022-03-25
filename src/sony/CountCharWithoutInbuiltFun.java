package sony;

public class CountCharWithoutInbuiltFun {

	public static void main(String[] args) {
		String s="one two three four five";
		String[] words = s.split(" ");
		int count=0;
		for (String word : words) {
			count++;
		}
		System.out.println(count);
//		for (int i = 0; i < words.length; i++) {
//			count++;
//		}
//		System.out.println(count);
	}

}
