class ArrayPractice {
	public static void main(String[] args) 	{
		//Declaration of array variable.
		int[] arr;
		
		//System.out.println(arr);//variable arr might not have been initialized
		//arr=5;//incompatible types: int cannot be converted to int[]

		// Creating array object and initialization of array variable
		arr= new int[5];
		//System.out.println(arr);//[I@15db9742(Object type @ Hash code) Address of array variable

		//Reading array object value
		System.out.println("_______________");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("_______________");

		//displaying array object value before initializing the arrayobject locations
		System.out.println("arr[0]-->"+arr[0]);
		System.out.println("arr[1]-->"+arr[1]);
		System.out.println("arr[2]-->"+arr[2]);
		System.out.println("arr[3]-->"+arr[3]);
		System.out.println("arr[4]-->"+arr[4]);
		System.out.println("_______________");


		//initialize array object locations
		arr[0]=5;
		arr[1]=6;
		arr[2]=7;
		arr[3]=8;
		arr[4]=9;

		//Displaying array object value after initializing the array object locations
		System.out.println("arr[0]-->"+arr[0]);
		System.out.println("arr[1]-->"+arr[1]);
		System.out.println("arr[2]-->"+arr[2]);
		System.out.println("arr[3]-->"+arr[3]);
		System.out.println("arr[4]-->"+arr[4]);
		System.out.println("_______________");
		
		//Modifying the array object locations
		arr[1]=11;
		arr[3]=10;
		arr[4]=arr[0]+arr[2];

		//Displaying array object value after modifying the array object locations
		System.out.println("arr[0]-->"+arr[0]);
		System.out.println("arr[1]-->"+arr[1]);
		System.out.println("arr[2]-->"+arr[2]);
		System.out.println("arr[3]-->"+arr[3]);
		System.out.println("arr[4]-->"+arr[4]);
		System.out.println("_______________");
		
		
	}
}
