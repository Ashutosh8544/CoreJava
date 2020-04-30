class AB{
	public static void main(String[] args) 
	{
		//Auto boxing
		Byte				b			 =			 40;			System.out.println(b);
		Short				s			 =			 50;			System.out.println(s);
		Integer			i			 =          60;			System.out.println(i);
		Long				l			 =			 70L;		System.out.println(l);
		Float				f			 =			  80F;		System.out.println(f);
		Double			d			 =			  90D;		System.out.println(d);
		Character   ch			 =			  'a';		System.out.println(ch);
		Boolean	   bo		 =		    true;		System.out.println(bo);
		
		System.out.println("_____________________________________________");
		
		byte				b1		=			40;					
		Byte				bo1		=			40;
	//byte				b2		=			128;	// CE: incompatible types: possible lossy conversion from int to byte
	//	Byte				bo2		=		    128;	//CE:   int cannot be converted to Byte
		int					i1			=			'a';				
	//	Integer			io1		=  		 'a';		/// CE: incompatible types: char cannot be converted to Integer
		long				L			=			50;				
	//	Long				Lo1		=   		50;	//CE: incompatible types: int cannot be converted to Long
		Character		ch1		=			'a';
		Character		ch2		=			97;
	//	Character		ch3		=			65537;	//CE: incompatible types: int cannot be converted to Character

	}

}
