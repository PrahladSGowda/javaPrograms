package group3;

public class SeparateAlphaNumSpChar {

	public static void main(String[] args) {//upper case 65-90, lowercase 97-122, numericals 48-57
		String s="har1i2s3h@";
		String s1="";
		String s2="";
		String s3="";
		String s4="";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z'||s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				s1=s1+s.charAt(i);
			}
			else if (s.charAt(i)>='0' && s.charAt(i)<='9') {
				s2=s2+s.charAt(i);
			}
			else
			{
				s3=s3+s.charAt(i);
			}
			
		}
		System.out.println("alphabets-->"+s1);
		System.out.println("numbers-->"+s2);
		System.out.println("special characters-->"+s3);

	}

}
