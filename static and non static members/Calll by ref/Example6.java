class Example6{//Call by ref
		void m1(Example6 e){
			System.out.println("\te: " + e);
			e = new Example6();
			System.out.println("\te: " + e);
		}
	public static void main(String[] args){
		Example6 e1 = new Example6();
		Example6 e2 = new Example6();

		System.out.println("e1: " + e1);
		e2.m1(e1);
		System.out.println("e1: " + e1);

		System.out.println("e2: " + e2);
		e1.m1(e2);
		System.out.println("e2: " + e2);

	}
}
