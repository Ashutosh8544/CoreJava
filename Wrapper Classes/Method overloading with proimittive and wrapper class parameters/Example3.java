class Example3{
	static void m1( char c){
		System.out.println("Character-args");
	}
	
	static void m1(Object o){
		System.out.println("Object-args");
	}
	public static void main(String[] args) 
	{
		m1(50);
		m1('a');
		m1(new Integer(50));
		m1(new Character('a'));
		m1(new Long(70));
		m1(80.45);
		m1(true);
	}
}
