class Test2 {
	public static void main(String[] args) 
	{
		StaticClass sc = new StaticClass();//here compiler will not error but for static class object creation is time
															  //wasting.
		System.out.println(sc.a);
		sc.m1();
		
	}
}
