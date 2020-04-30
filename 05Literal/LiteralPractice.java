class  LiteralPractice
{
	public static void main(String[] args) 
	{
		System.out.println("Literal | Practice");
		System.out.println("___________________");
		System.out.println("Integer literal");
		System.out.println(23);//int literal
		System.out.println(2.3F);//float literal
		System.out.println(23L);//long literal
        System.out.println(2.3D);//double literal
		System.out.println("___________________");

		System.out.println("Escape sequency");
		//System.out.println(');//single cots literal//unclosed literal
		//System.out.println('');//single cots literal need to have atleast one character.//
		System.out.println(' ');//single cots literal with space
		//System.out.println(''');//empty character literal
		//System.out.println('''');//empty character literal // unclosed literal
		System.out.println("'");//compiling as a ddouble cots
	    System.out.println(" ' ");//compiling as a ddouble cots

		System.out.println("___________________");

		System.out.println("Literal Type casting");
		System.out.println((byte)23);
		System.out.println((int)23);
		System.out.println((short)23);
		System.out.println((long)23);
		System.out.println((float)23);
		System.out.println((double)23);
		System.out.println("___________________");

		System.out.println((byte)2.3);
		System.out.println((int)2.3);
		System.out.println((short)2.3);
		System.out.println((long)2.3);
		System.out.println((float)2.3);
		System.out.println((double)2.3);
	    System.out.println(1234567890);
		//System.out.println(12345678901);//integer too large
		System.out.println(12345678901L);
	    //System.out.println((long)12345678901);//too large
		System.out.println("__________________");
	    
		System.out.println("\n");
		System.out.print("\t");
		System.out.println("\b");
		System.out.println("\f");
		System.out.println("__________________");

    	System.out.println(0123);// Consider as octal number
		System.out.println(0123L);//Consider as octal number as long type
		System.out.println(0123F);//Consider as floatting type integer 
		System.out.println(0123D);//Consider as double type integer
    	System.out.println((byte)0123);//Consider as octal as byte type
		System.out.println((short)0123);//Consider as octal as short type
		System.out.println((int)0123);//Consider as octal as integer int type
		System.out.println((double)0123);//Consider as octal as double type
		System.out.println("__________________");


		System.out.println("Underscore must be between two digit");//Consider as binary number
		System.out.println("____________________________________");
		System.out.println(012_3);
		System.out.println(012_3L);
		System.out.println(012_3D);
		System.out.println(012_3F);
		//System.out.println(0123_F);//underscore must between two digit.
		//System.out.println(0123_D);//underscore must between two digit.
		//System.out.println(012_3_L);//underscore must between two digit.

		System.out.println(1010);//Consider as integer type as int
		System.out.println(1_00_000);//Seperator underscore for understanding the programmer//Compiler remove the underscore.
		//System.out.println(X);//Consider as variable
		//System.out.println(XA);//Consider as variable
		//System.out.println(0X_A1);//under score must between two digit.
		//System.out.println(0_XA1);//under score must between two digit.
		System.out.println(0XA_B1);//under score must between two digit and A and B is consider as a integer in  hexa decimal nnumber.
		System.out.println(0b1010);//Consider as binary number
		System.out.println(0b1_010);//Consider as binary number
		//	System.out.println(0b_1010);//Consider as binary number
		//System.out.println(0_b1010);//Consider as binary numberw

		System.out.println("__________________________");

		System.out.println("Class and Packages finding");
		System.out.println("__________________________");
		}
}
		//System.out.println(java.util);
/*
Literal | Practice
___________________
Integer literal
23
2.3
23
2.3
___________________
Escape sequency

'
 '
___________________
Literal Type casting
23
23
23
23
23.0
23.0
___________________
2
2
2
2
2.3
2.3
1234567890
12345678901
__________________




__________________
83
83
123.0
123.0
83
83
83
83.0
__________________
1010
100000
1010
161
10

*/





