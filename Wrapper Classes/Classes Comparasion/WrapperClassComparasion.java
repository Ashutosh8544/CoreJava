class  WrapperClassComparasion{
	public static void main(String[] args) 
	{
		int i1 = 10 , i2 = 10;
		System.out.println(i1 == i2);  //true
//		System.out.println(i1.equals(i2));  // CE: int cannot be dereferenced
		Integer io1 = new Integer(10);
		Integer io2 = new Integer(10);
		
		Double do1 = new Double(10.0); 
	//	System.out.println(io1 == do1);   //  // CE:  incomparable types: Integer and Double
	System.out.println(io1.equals(do1));  /// false
	double do2 = 10.0;
	System.out.println(i1 == do2); //true
	}
}
