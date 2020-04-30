class A extends A6
{
	void m2(){
		System.out.println(this);
		System.out.println(A.this);
	//	System.out.println(super);
	//	System.out.println(A.super);
		System.out.println(super.x);
		}
	public static void main(String[] args) 
	{
		A a = new A();
		a.m2();

	}

}
