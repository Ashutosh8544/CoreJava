class InitializingSv{
	static int a;
	static void m1(int a){

		//int a;  //  CE:   variable a is already defined in method m1(int)
		InitializingSv.a=a;
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		System.out.println(a);
		m1(50);
		System.out.println(a);

	}
}
