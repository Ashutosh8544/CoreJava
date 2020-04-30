class Method1{

// only declaration statements aree allowed at class level

	static int a = 10;  // Declaration
	static int b = a + 10;  // Declaration with initializations

	//a = 20;    /// CE: <identifier> expected
	//System.out.prinln(a+"...."+b);  // CE

//	m1();	// CE:   invalid method declaration; return type required
	
	//illegal start of type
	/*
	if(true){
		System.out.println("Hiii");
	}
*/
	public static void main(String[] args) 
	{
		System.out.println(a+"...."+b);  
		m1();
		if(true){
		System.out.println("Hiii");
	}
	}
	static void m1(){
		System.out.println("m1");
	}
}
