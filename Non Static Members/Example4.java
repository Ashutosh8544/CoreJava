class Example4{
	int x = 10 , y = 20;
	void m1(){
		System.out.println("m1");
	}
	void printxy(){
		System.out.println(x);
		System.out.println(y);
		this.m1();		
	}
	public static void main(String[] args) 
	{
		Example4 e = new Example4();
		e.printxy();
		e.printxy();

	}
}
