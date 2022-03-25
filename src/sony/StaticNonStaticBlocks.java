package sony;

public class StaticNonStaticBlocks {
	StaticNonStaticBlocks(int a)
	{
		System.out.println("onetwo");
	}
	
	static
	{
		System.out.println("static first");
	}
	{
		System.out.println("non static first");
	}
	
	public static void main(String[] args) {
		StaticNonStaticBlocks s=new StaticNonStaticBlocks(10);
	}
}
