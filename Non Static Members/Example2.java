class Example2{
	int x = 10 , y = 20;
	void m1(){
		System.out.println("m1");
	}
	void printxy(){
		System.out.println(x);
		System.out.println(y);
		m1();
	}
	public static void main(String[] args) 
	{
		Example2 e = new Example2();
		e.printxy();
	}
}
