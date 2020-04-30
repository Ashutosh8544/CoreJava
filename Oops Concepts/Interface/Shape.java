// # RULE 6
//final interface Shape1{}	//CE:  illegal combination of modifiers: interface and final
abstract interface Shape2{}

interface Shape
{
	/*

	//	#RULE 1
	void findArea(){
		System.out.println("Shape Area");	// CE: interface methods cannot have body
	}
	*/
	
	//	#RULE 2
	double a = 111;					// public static  final a = 111.0;
	static double pi = 3.14; // public static  final  pi = 3.140;
	void findArea();			 // public abstract void findArea();
	void findPerimeter();// public abstract  void findperimeter();

	//	#RULE 3;
	/*
	private  double pi1 = 3.14;	// CE: modifier private not allowed here
	private void findArea1();		// CE: modifier private not allowed here
	protected void findPerimeter1();	// CE: modifier protected not allowed here
	*/

	//	#RULE 4
	
	//must assigin the vaue to the variable
	//	double pi2;  // CE:  = expected
	static double a1=111;

	
}

class Rectangle implements Shape{
	public	void findArea(){}
	public	void findPerimeter(){}
}

class Example{
	public static void main(String [] args){
		//	#RULE 5
	
	//	Shape s1 = new Shape();	// Shape is abstract; cannot be instantiated
		Shape s2;
		Shape s3 = null;
		Shape s4 = new Rectangle();
	}
}


















