class Test2{
	static void m3(Example e){
		e.m1();
		Sample s = (Sample)e;
		s.m2();
	}
	public static void main(String[] args){
		Test.m3(new Sample());
		Test.m3(new Example());
	}
}
