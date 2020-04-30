class Example10{
	int x = 10 , y = 20;
	void m1(){
		System.out.println(this.x);
		System.out.println(this.y);
		int x = 50;
		System.out.println(x); // Local Reference.
		System.out.println(this.y);
	}
	public static void main(String[] args) 
	{
		Example10 e1 =new Example10();
		e1.m1();
	}
}
