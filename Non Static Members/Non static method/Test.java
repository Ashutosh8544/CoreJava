class Test{
	public static void main(String[] args) 
	{
		NonStaticMethod1 nsv1 = new NonStaticMethod1();
		NonStaticMethod1 nsv2 = new NonStaticMethod1();
		
		System.out.println(nsv1.x+".."+nsv2.x);

		nsv1.m2();    nsv2.m2();

		nsv1.m1();
		System.out.println(nsv1.x+".."+nsv2.x);

		nsv2.x = 20;
		System.out.println(nsv1.x+".."+nsv2.x);
			
			nsv1.m2();				nsv2.m2();
		
	}
}
