package dump;

public class Demo {
/*
	public void doStuff(int x)
	{
		System.out.println("int");
	}*/
	
	public void doStuff(Integer x)
	{
		System.out.println("Integer");
	}
	
	/*public void doStuff(byte x)
	{
		System.out.println("byte");
	}*/
	
	
	public static void main(String[] args) {
	
		short x = 10;
		new Demo().doStuff(x);
	}
	
	
}
