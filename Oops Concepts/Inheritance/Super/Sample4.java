class  Sample4 extends Example4
{
	Sample4(){
		//super();
		System.out.println("From Sample class : 0-param constructor");
	}

	Sample4(int a){
		super(20);
		System.out.println("From Sample class : 0-param constructor");
		System.out.println("from Sample class:: " + a);
	}
	public static void main(String[] args) 
	{
		Sample4 s4 = new Sample4();
		Sample4 s5 = new Sample4(10);
		System.out.println("Hello World!");
	}
}