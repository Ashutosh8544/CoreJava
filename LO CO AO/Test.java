class  Test{
	public static void main(String[] args){
	//	System.out.println(x+"\t"+y);		//CE: non-static variable x cannot be referenced from a static context
																//CE: non-static variable y cannot be referenced from a static context
	//	System.out.println(e1.x+"\t"+e1y);	// CE: cannot find symbol
		Example1  e1 = new Example1();      //Local object of main method.
		System.out.println("value of x and y before calling m1() method");System.out.println(e1+"\t"+e1.x+"\t"+e1.y);
		e1.m1(e1); //Passing reference of e1 to m1() method 
		System.out.println("value of x and y after calling m1() method");
		e1.m2(e1);//Passing reference of e1 to m2() method

		Example1 e2  = new Example1();
		System.out.println("value of x and y before calling m1() method");System.out.println(e2.x+"\t"+e2.y);
		e2.x = 13;	e2.y = 23; 
		System.out.println("value of x and y after assining new values");
		e2.m2(e2);//Passing reference of e2 to m2() method 
		
		Example1 e3  = new Example1();
		e3.m3(e3);
	}
}
