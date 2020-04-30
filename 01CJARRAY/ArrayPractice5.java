class ArrayPractice5{
	public static void main(String[] args){
		//#Rule 1
	//	int [] ia1 = new int[];	//CE:	array dimension missing
		//must specify size
		
		//# Rule 2
		int [] ia2 = new int[5];
		
		int [] ia3 = new int['a'];
		
	//	int [] ia4 = new int[5L];		//CE:	 possible lossy conversion from long to int

	//	int [] ia5  = new int[5.6];		//CE:	possible lossy conversion from double to int
		
	//	int [] ia6 = new int["a"];		//CE:		 String cannot be converted to int
		
		//  Rule3
		//  int[]   ia7 = new int[-5];	// RE:		java.lang.NegativeArraySizeException

		// #Rule 5:
		int [] ia8= new int[5];
		ia8[0]=2;
		ia8[1]='a';
		// ia8[2]=5L;		// CE:		incompatible types: possible lossy conversion from long to int
		//	ia8[3]= 5.6;	//CE:	     incompatible types: possible lossy conversion from double to int
		//	ia8[4]="4";		//CE:		incompatible types: String cannot be converted to int
	
		//	#Rule 6:
		int [] ia9	=  new int[5];
		System.out.println(ia9[0]);

		System.out.println(ia9[0]);
		System.out.println(ia9[1]);
		//System.out.println(ia9[5L]);	// incompatible types: possible lossy conversion from long to int
		// System.out.println(ia9["123456"]);	//incompatible types: String cannot be converted to int
		// System.out.println(ia9[5.6]);	//incompatible types: possible lossy conversion from long to int
		
		//#Rule 7:	The array index must be >=0 and < array length. if not , compiler will not throw error JVM will throw error 
	//	System.out.println(ia9[5]);	//	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
		
	//	System.out.println(ia9['a]');	//unclosed character literal
		//System.out.println(ia9['a']);	//	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException

	//	#Rule 8:
	//	int[]	ia10 = {5,'a', 5L, 5.6,"abc"};	// types: possible lossy conversion from long to int

		//#Rule 9: In creating anymous array we must not specify the size of an array.
		// The size ofan array is the number of value we mentioned int {}.
		int[] ia11 = new int[]{5,6,7};	// rray size is 3.
		//int[] ia11 = new int[3]{5,6,7}; // array size must not be specified
		
		//#Rule 10: We can create empty array object it means array obj with no locations(Zero locations).

		int [] ia12= {};
		int[] ia13=new int[0];
		int[] ia14=new int[]{};
		
		ia13[0]=5;	//RE: ArrayIndexOUtOfBOudException.
		ia13[1]=5;	//RE: ArrayIndexOUtOfBOudException.
		// System.out.println(ia13[0]);//RE: ArrayIndexOUtOfBOudException.

		
		
		
	}
}
