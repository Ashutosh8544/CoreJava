class ArrayPractice3{
	public static void main(String[] args){
		
		//Different type of using array
		// using single array variables
		int[]		ia1;

		//int[5]	ia2			//illegal start of expression//']' expected//not a statement//';' expected

		int		ia3[];
		int		[]ia4;
	//	System.out.println(ia1);	//variable ia1 might not have been initialized
	//	[]int ia5;		//illegal start of expression
		
		int[]		ia5, ia6;
		//ia5=5;		//incompatible types: int cannot be converted to int[]
		//ia6=6;		//incompatible types: int cannot be converted to int[]
		ia5=new int[5];
		ia6=new int[5];

		int	ia7[], ia8;
	//	ia7= 8;		//incompatible types: int cannot be converted to int[]
		ia8=9;
		ia7=new int[5];
		//ia8=new int[5];	//incompatible types: int[] cannot be converted to int

		int	[]ia9, ia10;//=> int[]	ia9, ia10;

		//ia9=10;	//incompatible types: int cannot be converted to int[]
		//ia10=11;	//incompatible types: int cannot be converted to int[]
		ia9=new int[5];
		ia10=new int[5];

/*
int	ia11,	[]ia12; => int ia11,[]  ia12;//<identifier> expected
		ia11= 12;		 
		ia12=	13;		
		ia11=new int[5];		
		ia12=new int[5];		
*/
		
	
		int	ia13,	ia14[];

		ia13= 12;				
		//ia14=	13;				//incompatible types: int cannot be converted to int[]
		//ia13=new int[5];	// incompatible types: int[] cannot be converted to int	
		ia14=new int[5];	

		int ia15[];
		ia15=new int[5];
		ia15=null;

		//int ia15= new char[5];	//array dimension missing // variable ia15 is already defined in method main(String[])

		int[] ia16;		
	//	System.out.println(ia16);//variable ia16 might not have been initialized

		ia16= null;
		System.out.println(ia16);
		
		ia16=new int[5];
		System.out.println(ia16);		//[I@15db9742
		
	}
}
