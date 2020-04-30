class Sample{
	static int d = 50;
	static{
		System.out.println("Sample  Static block 1");
		//In Example.a load the class and execute thier static members only once.
		// And Access the Memory of a.
		System.out.println(Example1.a);
	}
	public static void main(String[] args) 
	{
		System.out.println("Sample Main");
		//Here Class loader will notload the class because its already loaded at Example1.a
		//It only access the memory of b.
		System.out.println(Example1.b);
	}
}