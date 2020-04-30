// Converting Primittive data type to wrapper classe object.
class WrapperClassDemo{
	public static void main(String[] args) 
	{
		int i = 50;
		Integer io1 = new Integer(i);
		Integer io2 = Integer.valueOf(i);

		System.out.println("i:"+i);
		System.out.println("io1:"+io1);
		System.out.println("io2:"+io2);
     //	Byte b1			= new Byte(50);	// CE: no suitable constructor found for Byte(int)
	//	Byte b2			= new Byte((Byte)5);	//CE:  incompatible types: int cannot be converted to Byte
		Byte b2			= new Byte((byte)1234);
		System.out.println(b2);
		byte b = (byte)128;
		System.out.println(b);

	///	Short s1 = new Short(12);	//CE: no suitable constructor found for Short(int)
		Short s1 = new Short((short)12);
		Short s2 = new Short((short)10092);
		Short s3 = new Short((short)12);

		System.out.println(s3);
		Character ch1 = new Character('a');
		Character ch2 = new Character((char)97);

	//	Character ch3 = new Character(97);	//CE: incompatible types: possible lossy conversion from int to char
		Float f1 = new Float(5.4F);
		Float f2 = new Float(50);
		Float f3 = new Float(50.25);
		Double d1 =  new Double(66);
		Double d2 =  new Double(66.45f);
		Double d3 =  new Double(66.56d);
		Double d4 =  new Double('a');
		Boolean bo1 = new Boolean(true);
	// Boolean bo2 = new Boolean('true');// CE : unclosed character literal
		Boolean bo3 = new Boolean("true");
		Boolean bo4 = new Boolean("True");


	}
}
