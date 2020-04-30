class Example2{
	//class level variable
	static int x = 10;

	static void m1(){
	Example2.x = 20;
	}
	public static void main(String[] args) 
	{	
				System.out.println(x);

	    Example2.x = 30;
		System.out.println(x);

		
		Example2.m1();
		
		System.out.println(x);
	}
}
