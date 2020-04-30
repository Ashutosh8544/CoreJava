class Example{

	static int a = m1();
		
	static{
		System.out.println("Static block 1 is  executed..");
	}
	
	static{
		System.out.println("Static block 2 is  executed..");
	}

	static{
		System.out.println("Static block 3 is  executed..");
	}
	
	static int m1(){
		System.out.println("Static variable a is created");	
		return 10;
	}
	
	static{
		System.out.println("Static block 4 is  executed..");
	}

	int x = m3();

	int m3(){
		System.out.println("Non static variable x is created");
		return 30;
	}

	{
				System.out.println("Non static block 1 is executed");
	}

	{
				System.out.println("Non static block 2 is executed");
	}

	public static void main(String[] args) {
		System.out.println();
		
		Example e1 = new Example();
		System.out.println();

		Example e2 = new Example();
	}

	int y = m4();

	int m4(){
		System.out.println("Non static variable y is created");	
		return 40;
	}

	static int b = m2();
	{
				System.out.println("Non static block 3 is executed");
	}

	static int m2(){
		System.out.println("Static variable b is  executed...");
		return 30;
	}
	
	{
				System.out.println("Non static block 4 is executed");
	}

	static{
		System.out.println("Static block 5 is executed..");
	}
}
