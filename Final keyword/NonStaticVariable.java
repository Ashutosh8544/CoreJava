class NonStaticVariable{
	final int p = 10;
	final int q , r;
	{
		q = 20;
	}
	{
		//q = 40;
		//r = 30;
	}
	NonStaticVariable(){
	
	}
	NonStaticVariable(int r){
		this();
	}
	public static void main(String[] args) 
	{
		NonStaticVariable nsv = new NonStaticVariable();
		System.out.println(nsv.p);
		System.out.println(nsv.q);
		System.out.println(nsv.r);

		NonStaticVariable nsv1 = new NonStaticVariable(13);
		System.out.println(nsv1.p);
		System.out.println(nsv1.q);
		System.out.println(nsv1.r);

	}
}
