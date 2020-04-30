class A{
	void m1(Example e){
		System.out.println("Example args");
	}
	void m1(Test t){
		System.out.println("Test args");
	}
	public static void main(String[] args) 
	{
		A a = new A();
		a.m1(new Example());   // op:-- Example args
		a.m1(new Sample());		// op:--  Example args
		//a.m1("abc");
		a.m1(new Test());

		a.m1(null);	
		a.m1((Sample)null);
		a.m1((Test)null);
	
	}
}
