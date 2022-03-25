package sony;

public class PrintOnlySplCharInString {

	public static void main(String[] args) { //32–47 / 58–64 / 91–96 / 123–126
		String s="Gsjdh%#12gg5@";
		for (int i = 0; i < s.length(); i++) {
			if(!((s.charAt(i) >='A' && s.charAt(i) <='Z') || 
					(s.charAt(i) >='a' && s.charAt(i) <='z') ||
					(s.charAt(i) >='0' && s.charAt(i) <='9')))
			{
				System.out.print(s.charAt(i)+" ");
			}
	}
}
}
