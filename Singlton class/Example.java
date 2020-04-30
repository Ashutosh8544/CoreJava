class Example{
	int a= 10;
	//For creating a singleton class we have to need follow three steps.

	// Step 1.   Creating private constructor.
	private Example(){}

	// Step 2.   Creating a private object of Example which prevent the to 
	// other programmmer for creation of object.
	private static final Example e = new Example();
	
	// Step 3.   Making a  method of class type which return the object reference. 
	public static Example getExample(){
		return e;
	}
}
