class Test{
	static Example e1 = new Example();  // We can declare outer class as satic.

	{
		System.out.println("Non Static Block");
	}
	Test(){
			System.out.println("Test class Constructor");
	}
	
	public static void main(String[] args) 
	{
		System.out.println(" Main Method");

	}
	static class Test1{}		// static keywor allowed here in inner class..
}
