class MethodWithPDT{
	static void m1(int a){
		System.out.println("int-args"+a);
	}
	public static void main(String[] args) 
	{
		m1((byte)50);
		m1(new Byte((byte)50));
		m1('a');
		m1(new Character('a'));
		m1(60);
		m1(new Integer(60));
		//m1(70L);	//CE:  incompatible types: possible lossy conversion from long to int
	//	m1(new Long(70L)); //CE: incompatible types: Long cannot be converted to int
		//m1(80.45);// CE:  incompatible types: possible lossy conversion from double to int
	//	m1(new Double(80.45)); // CE: incompatible types: Double cannot be converted to int

	}
}
