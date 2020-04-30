class Example3{
	int x = 10 , y = 20;
	void m1(){
		System.out.println("m1");
	}
	void printxy(){
		System.out.println(x);
		System.out.println(y);
		
	}
	public static void main(String[] args) 
	{
		Example3 e = new Example3();
		e.printxy();
		e.printxy();

	}
}
