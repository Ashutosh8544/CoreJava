class A 
{
	public static void main(String[] args) 
	{
		System.out.println("A main");
		m1();
}
public static void m1()
	{
	System.out.println("a m1");
	main(new String[0]);
	}
}

