package logicString;

public class PrintInitailLetterOfWordInUpperCAse {

	public static void main(String[] args) {
		String s="welcome to tyss";
	char ch=(char)(s.charAt(0)-32);//there is no space before 1st char so convert explicitly to upper case
	System.out.print(ch);
	for (int i = 1; i < s.length(); i++) {
		if(s.charAt(i)==' ')
		{
			System.out.print(" "+(char)(s.charAt(i+1)-32));
			i++;
		}
		else
		{
			System.out.print(s.charAt(i));
		}
	}
}
	}
