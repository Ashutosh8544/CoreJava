class Test2{
	public static void main(String[] args){
		byte b1=10;
		int i1=b1;

		///byte b2=i1;	//CE: incompatible types: possible lossy conversion from int to byte
		byte b2=(byte)i1;

		//int i=true;	//C/E:	incompatible types: boolean cannot be converted to int

	//	int i=(int)true;//CE: incompatible types: boolean cannot be converted to int

		int i2=240;
		//byte b3= i2;	//CE:incompatible types: possible lossy conversion from int to byte
		byte b3=(byte)i2;

		char ch1='a';
		int i3=ch1;

		int i4= 97;
		//char ch2=i4;

		long l1=10;
		float f1=l1;
        
		//long l2=f1;	//CE:	 incompatible types: possible lossy conversion from float to long
		float l2=(long)f1;

		System.out.println("b1\t"+b1);
	    System.out.println("i1\t"+i1);
		System.out.println("b2\t"+b2);
		System.out.println("b3\t"+b3);
		System.out.println("ch1\t"+ch1);
		System.out.println("i3\t"+i3);
		System.out.println("i4\t"+i4);
		System.out.println("i1\t"+i1);
		System.out.println("f1\t"+f1);
		System.out.println("i2\t"+i2);
		


			



	}
}
