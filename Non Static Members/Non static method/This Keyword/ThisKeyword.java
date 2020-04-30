class ThisKeyword{
	int x = 10;	//Non static variable
	
	void m1(){//Non static method
		//Reading and displaying of non static variable x
		System.out.println(x);
		//Asssigning non static variable value
		//this.x = 20;
		x = 20;
	}
	public static void main(String[] args) 
	{
		ThisKeyword TK1 = new ThisKeyword();//Creating first object
		ThisKeyword TK2 = new ThisKeyword();//Creating second object

	System.out.println("Reading and displaying  NSV of First obj1");	  System.out.println("TK1.x ===>"+TK1.x);
	System.out.println("Reading and displaying  NSV of First obj2"); System.out.println("TK2.x===>"+TK2.x);

	System.out.println("Calling m1() for first object");	TK1.m1();
	System.out.println("Calling m1() for Second object");	TK2.m1();

	System.out.println("Reading and displaying  NSV of First obj1 after calling m1()");	System.out.println("TK1.x ===>"+TK1.x);
	System.out.println("Reading and displaying  NSV of First obj2 after calling m1()");	System.out.println("TK2.x ===>"+TK2.x);

		TK1.x = 25;
	System.out.println("Reading and displaying  NSV of First obj1 after modifying from main()");	System.out.println("TK1.x ===>"+TK1.x);
	System.out.println("Reading and displaying  NSV of First obj2 after calling m1()"); System.out.println("TK2.x ===>"+TK2.x);
		
	System.out.println("Reading and displaying  NSV of First obj2 after modifying from main()"); TK2.x = 26;
		System.out.println("TK1.x===>"+TK1.x);
		System.out.println("TK2.x===>"+TK2.x);


	}
}
