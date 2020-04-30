class Example2{

	static Example2 e1 = new Example2();
	
	static{
		System.out.println("Static block ");
	}
	
	{
		System.out.println("Non static block");
	}
	
	Example2(){
		System.out.println("Constructor");
		System.out.println();
	}
	
	public static void main(String[] args){
		System.out.println("Main!");
		Example2 e2 = new Example2();
	}
	
	static int a= 10;
	
	int x = 20;
}
