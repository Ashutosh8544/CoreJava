class B extends A{
	void m1(){
		System.out.println("M1() of class B");
	}
	void m2(){
		System.out.println("M2() of class B");
	}
	void m3(){
		this.m1();
		this.m2();
		super.m1();
		super.m2();
	}
}
