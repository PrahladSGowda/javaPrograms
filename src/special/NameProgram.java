package special;

 public class NameProgram {

	public static void main(String[] args) {
		String s="naanu murgesh singh";
		String[] withSpace = s.split(" ");
		for (int i = 0; i < withSpace.length-1; i++) 
		{
			char ss = withSpace[i].charAt(0);
		System.out.print(ss+" ");
		}
		System.out.print(withSpace[withSpace.length-1]);
	}

}
