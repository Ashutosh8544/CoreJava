class Sample2 extends Example{
	Sample2(){
		// first statement super() is added by compiler
		System.out.println("Sample2 zero-param");
	}
    Sample2(int a){
		//For calling parameterized constructor of Exampleclass we have to add super(value) in the first statement  of Sample constructor.
		super(50);
		System.out.println("Sample2 int-param");
	}
	public static void main(String[] args){
	 Sample2 s1 = new Sample2();
	 Sample2 s2 = new Sample2(10);

	}
}
