class MethodWithWC{
	static void m1(Integer io){
		System.out.println("integer-io:" + io);
	}
	public static void main(String[] args) 
	{
	//	m1((byte)50);	//	CE: incompatible types: byte cannot be converted to Integer
	//	m1(new Byte(byte)50));
	//	m1('a');	// CE;  incompatible types: char cannot be converted to Integer
	//	m1(new Character('a'));  //CE: Character cannot be converted to Integer
			m1(60);
			m1(new Integer(60));
	//	m1(70L);
	//	m1(new Long(70L)); //CE: incompatible types: Long cannot be converted to Integer
	//	m1(80.45);	// CE: incompatible types: double cannot be converted to Integer
	//	m1(new Double(80.45));	// CE:  incompatible types: Double cannot be converted to Integer
	}
}
