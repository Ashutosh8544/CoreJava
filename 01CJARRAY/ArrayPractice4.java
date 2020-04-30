class ArrayPractice4{                   
	public static void ma in(String[] args){
		 
		//Different type of using array
		// using single arra y variables
		String[]		sa1;

		//String[5]	sa2			//illegal start of expression//']' expected//not a statement//';' expected

		String		sa3[];
		String		[]sa4;
	//System.out.println(sa1);	//variable sa1 might not have been initialized
	//[]String sa5;		//illegal start of expression
		
		String[]		sa5, sa6;
		//sa5=5;		//incompatible types: String cannot be converted to String[]
		//sa6=6;		//incompatible types: String cannot be converted to String[]
		sa5=new String[5];
		sa6=new String[5];

		String	sa7[], sa8;
		//sa7="abcd";		//incompatible types: String cannot be converted to String[]
		sa8="abcd";
		sa7=new String[5];
		//sa8=new String[5];	//incompatible types: String[] cannot be converted to String
 
		String	[]sa9, sa10;//=> String[]	sa9, sa10;

		//sa9="abcd";	//incompatible types: String cannot be converted to String[]
		//sa10="ashu";	//incompatible types: String cannot be converted to String[]
		sa9=new String[5];
		sa10=new String[5];

/*
String	sa11,	[]ia12; => String sa11,[]  sa12;//<identifier> expected
		sa11= "shweta";		 
		sa12=	Ashu;		
		sa11=new String[5];		
		sa12=new String[5];		
*/
		
	
		String	sa13,	sa14[];

		sa13= "4452";				
		//sa14=	"5546";				//incompatible types: String cannot be converted to String[]
		//sa13=new String[5];	// incompatible types: String[] cannot be converted to String	
		sa14=new String[5];	

		String sa15[];
		sa15=new String[5];
		sa15=null;

		//String sa15= new char[5];	//array dimension missing // variable ia15 is already defined in method main(String[])

		String[] sa16;		
	//	System.out.println(sa16);//variable ia16 might not have been initialized

		sa16= null;
		System.out.println(sa16);
		
		sa16=new String[5];
		System.out.println(sa16);		//[Ljava.lang.String;@15db9742
		
	}
}
