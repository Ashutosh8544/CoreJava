class Example{
	void m1(){
		System.out.println("In m1 Method");
	}
	public static void main(String[] args) 
	{
		System.out.println("In Main method");
	//	m1(); // CE:  non-static method m1() cannot be referenced from a static context
	}
}
