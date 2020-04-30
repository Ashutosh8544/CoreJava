class Example{
	void m1(){
		System.out.println("m1 start");
		m1();
		System.out.println("m1 End");
	}
	public static void main(String[] args){
		System.out.println("main start");
		Example e = new Example();
		System.out.println("Object is created:");
		e.m1();
		System.out.println("main end");
	}
	int x = m2();
	int m2(){
		System.out.println("Non static variable x");
		return 50;
	}
	Example(){
		System.out.println("Constructor start");
		System.out.println("Constructor end");

	}
}
