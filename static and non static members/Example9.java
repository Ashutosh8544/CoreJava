class Example9{
	int x = 10 , y = 20;
	void m1(){
		System.out.println(x);
		System.out.println(y);
		int x = 50;
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) 
	{
		Example9 e1 =new Example9();
		e1.m1();
	}
}
