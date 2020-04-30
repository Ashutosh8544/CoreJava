// Convertiing primittive String object to Wrapper class object.
class WrapperClassDemo{
	public static void main(String[] args) 
	{
		
		Integer io1 =new Integer("10");
		Integer io2 =new Integer("1");
		
		Byte b1 = new Byte("1");
	//Byte b2 = new Byte("128"); // RE: Exception in thread "main" java.lang.NumberFormatException: Value out of range. Value:"128" Radix:10

//		Integer io3 =new Integer("a");  // RE:. Exception in thread "main" java.lang.NumberFormatException: For input string: "a"
//		Integer io4 =new Integer("5.4");  // RE: Exception in thread "main" java.lang.NumberFormatException: For input string: "5.4"
//	Integer io5 =new Integer("5L");  // RE: Exception in thread "main" java.lang.NumberFormatException: For input string: "5L"
		
	//	Long lo1 = new Long("5L");   //RE:  Exception in thread "main" java.lang.NumberFormatException: For input string: "5L"

		Float fo1 = new Float("5");
		Float fo2 = new Float("5.4");
		Float fo3 = new Float("5.4F");
		Float fo4 = new Float("5.4D");
//		Float fo5 = new Float("5.4L"); // RE: Exception in thread "main" java.lang.NumberFormatException: For input string: "5.4L"
///		Float fo6 = new Float("a"); // RE: Exception in thread "main" java.lang.NumberFormatException: For input string: "a"

//	Character ch = new Character("a"); // CE; incompatible types: String cannot be converted to char

		Boolean bo1 = new Boolean("false"); System.out.println("bo1:" + bo1);
		Boolean bo2 = new Boolean("true"); System.out.println("bo2:" + bo2);
		
		Boolean bo3 = Boolean.valueOf("false"); System.out.println("bo3:" + bo3);
		Boolean bo4 = Boolean.valueOf("true"); System.out.println("bo4:" + bo4);

		Boolean bo5 = new Boolean("False"); System.out.println("bo5:" + bo5);
		Boolean bo6 = new Boolean("True"); System.out.println("b6:" + bo6);
		
		Boolean bo7 = Boolean.valueOf("False"); System.out.println("bo7:" + bo7);
		Boolean bo8 = Boolean.valueOf("True"); System.out.println("bo8:" + bo8);

		Boolean bo9 = new Boolean("Ashu"); System.out.println("bo9:" + bo9);
		Boolean bo10 = new Boolean("TRue"); System.out.println("b10:" + bo10);
		
		Boolean bo11 = Boolean.valueOf("Shweta"); System.out.println("bo11:" + bo11);
		Boolean bo12 = Boolean.valueOf("FALSE"); System.out.println("bo12:" + bo12);
	
		Boolean bo13 = new Boolean(null); System.out.println("bo13:" + bo13);
		Boolean bo14 = new Boolean(null); System.out.println("b14:" + bo14);
		
		Boolean bo15 = Boolean.valueOf(""); System.out.println("bo15:" + bo15);



	}
}
