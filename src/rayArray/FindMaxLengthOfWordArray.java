package rayArray;

public class FindMaxLengthOfWordArray {

	public static void main(String[] args) {
		String[] str={"one","two","thrree","thrree","fivee"};
		String max = str[0];
		for (int i = 1; i < str.length; i++) {
			if(max.length()<str.length)
			{
				max=str[i];
			}
		}
		for (int i = 0; i < str.length; i++) {
			if(max.length()==str[i].length())
			{
				System.out.println(str[i]+"-->"+str[i].length());
			}
		}
		
	}

}
