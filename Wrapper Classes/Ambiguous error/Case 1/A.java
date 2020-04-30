class A{
	void m1(Example e){
		System.out.println("Example args");
	}
	void m1(Sample s){
		System.out.println("Sample args");
	}
	public static void main(String[] args) 
	{
		A a = new A();
		a.m1(new Example());   // // op:- Example args
		a.m1(new Sample());  // op:-  Sample args
	//	a.m1("abc");		//CE:  no suitable method found for m1(String)
		a.m1(null);		// op:-  Sample args

		Example e1 = new Example();
		Example e2 = new Sample();
		Sample s1 = new Sample();
		Example e3 = null;
		Sample s2 = null;

		System.out.println();

		a.m1(e1); //op:--  Example args
		a.m1(e2);		//op:--   Example args
		a.m1(s1);		//op:--  Sample args
		a.m1(e3);  // op:--  Example args
		a.m1(s2);		//op:--   Sample args
	}
}
