class Example3{
	Example3  e1 = new Example3();	// Exception in thread "main" java.lang.StackOverflowError
	static{
		System.out.println("Static Block");
	}
	Example3(){
		System.out.println("Constructor");
	}
	{
			System.out.println("Non Static Block");
	}
	public static void main(String[] args)
	{
		System.out.println("Main..");
		Example3  e2 = new Example3();
	}
}
