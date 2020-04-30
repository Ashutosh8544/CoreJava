class Test3{
	static void m3(Object o){
		if (o instanceof Example)
		{
			Example e = (Example)o;
			e.m1();
		}
				
		else if (o instanceof Sample)
		{
			Sample s = (Sample)o;
			s.m1();
			s.m2();
		}
	}
	public static void main(String[] args){
		Test.m3(new Example());
		Test.m3(new Sample());
		Test.m3(new Object());	//CE: incompatible types: Object cannot be converted to Example
	}
}
