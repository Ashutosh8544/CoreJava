import java.lang.*;
class WrapperDemoClass{
	//1.PSO-->WCO--->PDT
 //2. PSO--> PDT
	public static void main(String[] args) 
	{
		int i1 = Integer.parseInt("10");
	//	int i2 = Integer.parseInt("10.0");  // RE: Exception in thread "main" java.lang.NumberFormatException: For input string: "10.0"
		
	//	byte b1 = Byte.parseInt("40");  // CE: cannot find symbol pasrseInt();
			byte b2 = Byte.parseByte("40");
	//	byte b3 = Byte.parseByte("128"); // RE: Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"128" Radix:10

		float f1 = Float.parseFloat("10");
		float f2 = Float.parseFloat("50.4562");
		float f3 = Float.parseFloat("6040.451F");

		boolean bo1 = Boolean.parseBoolean("True");		System.out.println("bo1: " + bo1);
		boolean bo2 = Boolean.parseBoolean("False");	System.out.println("bo2: " + bo2);
		boolean bo3 = Boolean.parseBoolean("Ashu");	System.out.println("bo3: " + bo3);
		boolean bo4 = Boolean.parseBoolean("Ture");		System.out.println("bo4: " + bo4);
		
	

		}
}
