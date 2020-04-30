class Example2{
	int x = 10;
	int y = 20;
	//for getting the reference of current object in m1() method we have to take class name with reference as a parameter.
	void m1(Example2 e){
		e.x = 12;
		e.y = 22;
	}
	void m2(Example2 e){
		System.out.println("Value of x  and y of current object");
		System.out.println(this+"\t"+this.x+"\t"+this.y);

		System.out.println("Value of x  and y of Argument object");
		System.out.println(e+"\t"+e.x+"\t"+e.y);
	}
	void m3(Example2 e){
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
	public static void main(String[] args){
	//	System.out.println(x+"\t"+y);		//CE: non-static variable x cannot be referenced from a static context
																//CE: non-static variable y cannot be referenced from a static context
	//	System.out.println(e1.x+"\t"+e1y);	// CE: cannot find symbol
		Example2  e1 = new Example2();      //Local object of main method.
		System.out.println("value of x and y before calling m1() method");System.out.println(e1+"\t"+e1.x+"\t"+e1.y);
		e1.m1(e1); //Passing reference of e1 to m1() method 
		System.out.println("value of x and y after calling m1() method");
		e1.m2(e1);//Passing reference of e1 to m2() method

		Example2 e2  = new Example2();
		System.out.println("value of x and y before calling m1() method");System.out.println(e2.x+"\t"+e2.y);
		e2.x = 13;	e2.y = 23; 
		System.out.println("value of x and y after assining new values");
		e2.m2(e2);//Passing reference of e2 to m2() method 
		
		Example2 e3  = new Example2();
		e3.m3(e3);
	}
}
