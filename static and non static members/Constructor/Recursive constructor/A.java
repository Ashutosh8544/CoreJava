class A{
	A(){
		System.out.println("Constructor");
		A a = new A();
	}
	public static void main(String[] args){
		System.out.println("Main");
		A a = new A();
	}
}
