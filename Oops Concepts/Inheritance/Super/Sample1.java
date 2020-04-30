class Sample1 extends Example{
	Sample1(){
		// first statement super() is added by compiler
		System.out.println("Sample1 zero-param");
	}
    Sample1(int a){
		// first statement super() is added by compiler
		System.out.println("Sample1 int-param");
	}
	public static void main(String[] args){
	 Sample1 s1 = new Sample1();
	 Sample1 s2 = new Sample1(10);
	}
}
