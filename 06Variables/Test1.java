class Test1{
	public static void main(String[] args){
	
	byte b1=10;
	System.out.println("b1\t"     +b1);

	byte  b2;
	b2=20;
	//byte b3= b1+b2;	//CE:	possible lossy conversion from int to byte.
	//System.out.println("b3\t" +b3);
	
	short s1=10;
	short s2=20;
	//short s3=s1+s2; //CE:  incompatible types: possible lossy conversion from int to short
	
	char ch1='a';
	char ch2='b';
	//char ch3=ch1+ch2; //CE:  incompatible types: possible lossy conversion from int to char

	 byte b4=10+20;
	 System.out.println("b4\t"+b4);
	
	 byte b5=126+1;
	 System.out.println("b5\t"+b5);

	 //byte b6=126+2;
	 //System.out.println("b6\t"+b6);
		
	  //byte b7=10L+20; //CE: incompatible types: possible lossy conversion from long to byte
//		byte b7=(byte)10L+20;
		byte b7=(byte)(10L+20);
		System.out.println("b7\t"+b7);

		
		byte b8=(int)10L+20;
		System.out.println("b8\t"+b8);
		
		char ch4='a'+'b'; //CE:  variable ch1 is already defined in method main(String[])
		//char ch5=ch4+'c';	//CE:  possible lossy conversion from int to char
		System.out.println("ch4\t"+ch4);
	
		System.out.println(0.0/0);	// o/p:	NaN
		System.out.println(0/0);	//RE: "main" java.lang.ArithmeticException: / by zero at Test1.main(Test1.java:43)
	

	
	
	}
}
