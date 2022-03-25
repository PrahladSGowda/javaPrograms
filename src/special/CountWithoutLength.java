package special;

public class CountWithoutLength {

	public static void main(String[] args) {
		String s="testyantra";
		String s1="";
		System.out.println(s.compareTo(s1));
		int i=0;
		while(true)
		{
			try{
			s.charAt(i);
			i++;
			}
			catch(Exception e){
				System.out.println(i);
				break;
			}
		}
	}
}
