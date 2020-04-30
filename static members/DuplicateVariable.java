class DuplicateVariable{
	static int a = 20;
	// CE: it is already definned in  DuplicateVariable class
//	static int a = 10;

	public static void main(String[] args) 
	{
		// a variable is only defined in this method only.
		int a  = 20;

		// Local variable.
		int p = 30;
//		double p = 40; //CE: variable p is already defined in method main(String[])
	}
	static void m1(){
	 int p = 50;
	}

}
