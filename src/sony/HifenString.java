package sony;

public class HifenString {

	public static void main(String[] args) {
		String s="nothingGK";
		String s1 = s.toLowerCase();
		String s2 = s1.substring(7);
		String s3 = s.substring(0,7);
		System.out.println(s3); 
		String hifen = s3+"_"+s2;
		System.out.println(hifen);

	}

}
