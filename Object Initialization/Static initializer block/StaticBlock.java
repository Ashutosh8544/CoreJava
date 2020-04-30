class StaticBlock{
	//four ways of initializing staic variable
	//1
	static int a = 10;
	
	//2.  initializing in the another class (Test)
	static int b;
	static int c;
	static int d;
	
	static{
				// 3.   Initialiizing in the static initializer block.
				 c = 30;
	}
	//4.   Initializing with setter method
	// variable shadowing:-- Same variable name on class level and method level.
	static void setD(int d){
					//local preference:--- Reading value from parameter and storing also in it.
					// Here no Compile time error and Run TIme error.
					//  no value changing in static variable d.
					// d = d;
				StaticBlock.d = d;
	}
}

