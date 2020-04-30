class  Example12{
	int x = m1();
	int m1(){
		System.out.println("m1 start");
		System.out.println("\nNon static variable");
		System.out.println("m1 end");
		return 10;
	}
	{
		System.out.println("Non static block start");
		Example12 e = new Example12();
		System.out.println("Non static block end");
	}
	Example12(){
		System.out.println("Constructor start");
		System.out.println("Constructor end");
	}

	public static void main(String[] args) 
	{
		System.out.println("main start");
		Example12 e  = new Example12();
		System.out.println("main end");
	}
}
