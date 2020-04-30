class Test{
	public static void main(String[] args) 
	{
//		Example e1 = new Example();  /// CE:  Example() has private access in Example.
//		Example e2 = new Example(); /// CE: Example() has private access in Example.
		
		//Creating an Reference variable of siglton class(Example)
		Example e1 = Example.getExample();
		Example e2 = Example.getExample();

		//System.out.println(e1 = e2); // o/p:--- Example@15db9742
	//	System.out.println(e1 = = e2);	// CE: illegal start of expression

		System.out.println(e1 == e2);	//o/p :---  true

	
	}
}
