class Main 
{
/*	public static void main(String[] args) 
	{
		System.out.println("Main 1");
	}
	*/
	/*
	static void main(String[] args) 
	{
		System.out.println("Main 1");  // Main method not found in class Main, please define the main method as:
																// public static void main(String[] args)
																	//or a JavaFX application class must extend javafx.application.Application
	}
	*/
//	private static void main(String[] args) //RE

	//protected static void main(String[] args)  //RE

//	static public void main(String[] args) // No RE, CE
	
	//native public void main(String[] args)  //CE: native methods cannot have a body

//abstract public void main(String[] args) // CE: abstract methods cannot have a body
	
//	final public void main(String[] args)// RE
	
//	strictfp public void main(String[] args)  //RE
	
//	synchronized public void main(String[] args) //RE
	
	//public strictfp void main(String[] args)
	
	//synchronized static public void main(String[] args) //No RE CE
	// public synchronized static void main(String[] args)// //No RE CE
	
	// 	 public synchronized static final void main(String[] args)// //No RE CE
	// public abstract static final void main(String[] args)// // RE CE

	// public static synchronized final void main(String[] args)// //No RE CE
	// public synchronized static strictfp void main(String[] args)// //No RE CE

	 	// public synchronized static final  volatile void main(String[] args)// //CE:modifier volatile not allowed here

	//strictfp public synchronized static  void main(String[] args)// //No RE CE
	//	transient public synchronized static  void main(String[] args)// // CE: modifier transient not allowed here

//    public static volatile void main(String[] args)  //CE

//	 public void synchronized static final  main(String[] args)// CE

	// public static void main(String      []args)// NO RE CE

//  public static void main(String      args[])// NO RE CE
 
  //public static void main(String      ashu[])// NO RE CE

 //public static void main(String  ashu)// RE
  // public static void main(String..  ashu)// RE

//   public static void main(String...  ashu)// NO CE RE

   // public static void main(String....  ashu)// CE

 //public static void main(String.*  ashu)// CE:  <identifier> expected

  // public static void main(int [] ashu)// RE

//   public static void main(int...  ashu)// RE
  // public static void main(boolean ashu)// RE
 
     //public static void main([]String   ashu)// CE

//    public static void main(String[6] ashu)// CE

 // public static void main(String[null] ashu)// CE

    public static void main(String[] ashu)
	{
		System.out.println("Main 1");
		System.out.println(ashu[0]);// ArrayIndexOutOfBoundException

	}


}
