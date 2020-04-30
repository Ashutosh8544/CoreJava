//Converting Wrapper class object to Primittive Data type 
class WrapperClassDemo{
	public static void main(String[] args){
		Integer io1 = Integer.valueOf(254);
		int x = io1.byteValue();
		int y = io1.intValue();
		int z = io1.shortValue();
	//	int w = io1.floatValue(); // CE: incompatible types: possible lossy conversion from float to int

		byte b1 = io1.byteValue();
	//	byte b2 = io1.shortValue();// CE: incompatible types: possible lossy conversion from short to byte
	//	byte b3 = io1.intValue(); // CE: incompatible types: possible lossy conversion from int to byte
	short s1 = io1.byteValue();
	short s2 = io1.shortValue();

	float f1 = io1.floatValue();
	float f2 = io1.byteValue();
	float f3 = io1.shortValue();
	float f4 = io1.intValue();
	float f5 = io1.longValue();
	//float f6 = io1.doubleValue();  //CE: incompatible types: possible lossy conversion from double to float

	double d1 = io1.doubleValue();
	double d2 = io1.floatValue();
	double d3 = io1.intValue();
	double d4 = io1.shortValue();
	double d5 = io1.byteValue();
	double d6 = io1.longValue();
	
//	char ch1 = io1.charValue();
//	char ch2 = io1.intValue();	//CE:  incompatible types: possible lossy conversion from int to char
	char ch3 = (char)io1.intValue();

	boolean bo1 = io1.booleanValue();
//	boolean bo2 = io1.intValue();  //CE:. incompatible types: int cannot be converted to boolean
//	boolean bo3 = (boolean)io1.intValue(); //CE:. incompatible types: int cannot be converted to boolean


	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	System.out.println(b1);
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(f1);
	System.out.println(f2);
	System.out.println(f3);
	System.out.println(f4);
	System.out.println(f5);
	System.out.println(d1);
	System.out.println(d2);
	System.out.println(d3);
	System.out.println(d4);
	System.out.println(d5);
	System.out.println(d6);
	System.out.println(ch3);

	}
}
