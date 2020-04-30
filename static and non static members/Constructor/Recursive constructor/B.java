class B{
	static{
		System.out.println("static block ");
		B b = new B();
	}
	B(){
		System.out.println("Constructor");
	}
	public static void main(String[] args){
		System.out.println("main");
		B b = new B();
	}
}
