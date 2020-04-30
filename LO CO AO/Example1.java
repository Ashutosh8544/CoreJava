class Example1{
	int x = 10;
	int y = 20;
	//for getting the reference of current object in m1()
//method we have to take class name with reference as a parameter.
	void m1(Example1 e){
		e.x = 12;
		e.y = 22;
	}
	void m2(Example1 e){
		System.out.println("Value of x  and y of current object");
		System.out.println(this+"\t"+this.x+"\t"+this.y);

		System.out.println("Value of x  and y of Argument object");
		System.out.println(e+"\t"+e.x+"\t"+e.y);
	}
	void m3(Example1 e){
		Example1 e3  = new Example1(); // Local object creation.
		 e3.x = 30;   // Local variables x and y
		 e3.y = 40;  
		System.out.println("Value of x  and y of local object");
		System.out.println(e3+"\t"+e3.x+"\t"+e3.y);

		System.out.println("Value of x  and y of current object");
		System.out.println(this+"\t"+this.x+"\t"+this.y);

		System.out.println("Value of x  and y of Argument object");
		System.out.println(e+"\t"+e.x+"\t"+e.y);
	}
}
