class Example{
	public static void main(String[] args){
		System.out.println("main start");
		Example e = new Example();
		System.out.println("Object is created:");
		System.out.println("main end");
	}
	int x = m2();
	int m2(){
		System.out.println("Non static variable x");
		return 10;
	}
	{
		System.out.println("Non static block start");
		System.out.println("Non static block end");
	}
	Example(){
		System.out.println("Constructor start");
		Example e = new Example();
		System.out.println("Constructor end");

	}
}
