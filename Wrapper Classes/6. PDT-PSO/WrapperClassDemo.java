class WrapperClassDemo{
	public static void main(String[] args){
     //	String s1 =  10;	//CE:.  incompatible types: int cannot be converted to String
	//		String s2 = "10";			System.out.println("s2" + s2);
  //		String s3 =  Integer.toString(10); 			System.out.println("s3" + s3);

	//	String s4 =  Byte.toString(10);					System.out.println("s4:" + s4);  // CE: incompatible types: possible lossy conversion from int to byte
		String s5 =  Byte.toString((byte)10);		System.out.println("s5:" + s5);
		
		String s6 =  Integer.toString('a');			System.out.println("s6:" + s6);
	//	String s7 =  Integer.toString("a");			System.out.println("s7:" + s7); // CE: incompatible types: String cannot be converted to int
	//	String s8 =  Integer.toString(10.0);		System.out.println("s8:" + s8);  /CE: incompatible types: possible lossy conversion from double to int

		String s9 =    Float.toString(20);				System.out.println("s:" + s9);
		String s10 =  Float.toString(30L);			System.out.println("s10:" + s10);
		String s11 =  Float.toString(40.0F);		System.out.println("s11:" + s11);
		String s12 =  Float.toString(50.0F);        System.out.println("s12:" + s12);
	//String s13 =  Float.toString(60.0);          System.out.println("s13:" + s13);  // CE:  incompatible types: possible lossy conversion from double to float
		
		String s14 =  Boolean.toString(false);		System.out.println("s14:" + s14);
		String s15 =  Boolean.toString(true);		System.out.println("s15:" + s15);
	//	String s16 =  Boolean.toString(True); System.out.println("s16:" + s16);  // CE: cannot find symbol
	
	String s17 = Double.toString(10);				System.out.println("s17:" + s17);
	String s18 = Double.toString('a');				System.out.println("s18:" + s18);
	String s19 = Double.toString(10.65);				System.out.println("s19:" + s19);
	String s20 = Double.toString(100.455F);				System.out.println("s20:" + s20); //op: 100.45500183105469 ???
	String s21 = Double.toString(10L);				System.out.println("s21:" + s21);
	String s22 = Double.toString(10D);				System.out.println("s22:" + s22);

	// String s23 = Short.toString(5);  // CE: incompatible types: possible lossy conversion from int to short

}
}
