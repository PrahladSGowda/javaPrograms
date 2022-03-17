package special;

public class SwapFirstAndLstWord {

	public static void main(String[] args) {
		String str="one two three four five";
		String[] strws = str.split(" ");
		String temp = strws[0];
		strws[0]=strws[strws.length-1];
		strws[strws.length-1]=temp;
		for (int i = 0; i < strws.length; i++) {
			System.out.print(strws[i]+" ");
		} 
	}

}
