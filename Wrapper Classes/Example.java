class Example{
	public static void main(String[] args) 
	{
		Byte b1 = new Byte((byte)10);
	//	Integer i1 = b1; //CE:   incompatible types: Byte cannot be converted to Integer
	//	Integer i2 = (Integer)b1; // CE: incompatible types: Byte cannot be converted to Integer
	//	Integer i3 =   new Integer(10);//CE: incomparable types: Byte and Integer
//		System.out.println(b1==i3);
		System.out.println(b1);
		
	}
}
