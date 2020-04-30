class Prog{
		static int[] ia5=new int[3];
		static int[] ia6={1,2,3};
		static int[] ia7=new int[]{4,5,6};
		
		static void arr(int[] ia8/* declaration of array variable name*/){
		System.out.println(java.util.Arrays.toString(ia8));
		}
}
class ArrayPractice2{
	public static void main(String[] args){
		
		//new keyword syntax declaration.
		int[] ia1=new int[3];
		//Initializer floor bracket({}) syntax
		int[] ia2={1,2,3};
		System.out.println(java.util.Arrays.toString(ia2));
		
		//Anonymous array
		int[] ia3=new int[]{4,5,6};
		
		System.out.println(java.util.Arrays.toString(ia3));
		
		int[] ia4;
		ia4=new int[3];

		//ia4={7,8,9};//CE: illegal start of expression

		ia4=new int[]{10,11,12};
		System.out.println(java.util.Arrays.toString(ia4));
		//calling static method array vaariable of new keyword
		Prog.arr(new int[3]);
		//Prog.arr({13,14,15});

		//calling static method array vaariable of Anonymous array
		Prog.arr(new int[]{16,17,18});
	}
}
