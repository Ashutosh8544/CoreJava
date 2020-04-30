class Prog{
	public static void main(String[] args) 
	{

		byte			b1			=			 50;						
		int				i1				=			 b1;						

		int   			i2				=			 50;						
	//	byte			b2			=			 i2;			//CE: possible lossy conversion from int to byte		
		byte			b3			=			 (byte)i2;				
		
		int				i3				=			 'a';

		double		d1			=			50;
		double		d2			=			60L;
		double		d3			=			70.34F;
		double		d4			=			30.45;
		
	//	double		d5			=			true; // CE:  boolean cannot be converted to double

	//byte				b11				=			new Integer(50);
	int					i11					=			new Byte((byte)50);

	int					i21					=			new Integer(50);
	//byte				b21				=			new Integer(50);
	//byte				b31				=			(byte)new Integer(i2);
	byte				b41				=			(byte)new Integer(i2).intValue();

	int					i31					=			new Character('a');

	double			d11				=			new Integer(50);
	double			d21				=			new Long(60L);
	double			d31				=			new Float(60.54F);
	double			d41				=			new Double(60.4452);

//	double			d51				=			new Boolean(true);




	}
}
