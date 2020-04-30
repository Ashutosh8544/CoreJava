class Example{
	static int a   = 10;

	static void m1(){
		a = 15;
	}
	static void m2(){
		System.out.println(a);
	}
	public static void main(String[] args){
		System.out.println("Displaying value before calling static method m1.");
		System.out.println(a);
		m2();
		
		System.out.println("Calling static m1 method.");
		m1();
		
		System.out.println("Displaying value after calling ststic method m1.");
		System.out.println(a);
		m2();

		System.out.println(" Assigning static variable from main method.");
		a = 20;
		
		System.out.println("Displaying value after assiggning main method.");
		System.out.println(a);
		m2();

	}
}
