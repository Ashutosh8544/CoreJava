class  Employee2{
	static int a = 10;
	static int b = 20;
	int x = 30;
	int y = 40;
	public static void main(String[] args) 
	{
		//Direct calling static variable by the variable name.
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		//Calling static variable by the class name.
		System.out.println("a:" + Employee2.a);
		System.out.println("a:" + Employee2.b);
		//Calling non static variable  by using Object reference.
		Employee2 e1 = new Employee2();
		System.out.println("a:" + e1.x);
		System.out.println("a:" + e1.y);
		//Calling static variable by using Object reference.
		System.out.println("a:" + e1.a);
		System.out.println("a:" + e1.b);
		//Calling Nin static variable by using class name.
		//	System.out.println("a:" + Employee2.x);  // CE:  non-static variable x cannot be referenced from a static context
		//	System.out.println("a:" + Employee2.y);  // CE:  non-static variable y cannot be referenced from a static context
		Employee2 e2 = null;
		System.out.println("a:" + e2.a);  // Exception in thread "main" java.lang.NullPointerException
		System.out.println("a:" + e2.x);  // Exception in thread "main" java.lang.NullPointerException
	}
}
