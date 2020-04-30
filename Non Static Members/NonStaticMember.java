class NonStaticMember{
	int x;
	int y;
	int z;
	int p;
	int q;

	//Non Static Block
	{
		z = 30;
		p = 40;
		System.out.println("Non Static Blcok initialization");
		System.out.println(z + "\t" + p );
	}
	//No Parameter Constructor
	NonStaticMember(){
		x = 50;
		y = 60;
		System.out.println("No paratmeter Constructor initialization");
		System.out.println(x + "\t" + y);
	}
	
	//Non Static Method
	void m1(){
		q = 10;
	}
	//NON Static 
	class NonStaticInnerClass{
		int a = 20;
		NonStaticInnerClass NSIC = NonStaticInnerClass();
	}
	public static void main(String[] args) 
	{
		NonStaticMember NSM1 = new NonStaticMember();
	}
}
