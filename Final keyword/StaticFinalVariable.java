class StaticFinalVariable{
	static final int x =  10;
	static final int y , z;
	static final Example e1 = new Example();
	static final Example e2;
	static {
	//	x = 20; //CE: cannot assign a value to final variable x
	e2 = new Example();
	}
	static{
//		e1  = new Example(); // CE:  cannot assign a value to final variable e1
		y = 30;
		z = 40;
	}
	static {
	//	e2 = new Example();  //CE: variable e2 might already have been assigned
	//	x= 10;		//CE: cannot assign a value to final variable x
	//	y=20;	// CE: variable y might already have been assigned
	//	z=30;	//CE: variable z might already have been assigned
	}
	public static void main(String[] args) 
	{
	//	y =  30; // CE: cannot assign a value to final variable y
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(e1);
		System.out.println(e2);

	}
}
