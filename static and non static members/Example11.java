class  Example11{
	static{
		System.out.println("static block start");
		Example11 e = new Example11();
		System.out.println("static block end");
	}
	{
		System.out.println("Non static block start");
		System.out.println("Non static block end");
	}
	Example11(){
		System.out.println("Constructor start");
		System.out.println("Constructor end");
	}
	public static void main(String[] args) 
	{
		System.out.println("main start");
		System.out.println("main end");
	}
}
