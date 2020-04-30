class Test{
	public static void main(String[] args) 
	{
		ThisKeyword1 TK1 = new ThisKeyword1();
		TK1.x = 15;
		
		TK1.m1();
		
		TK1.m2();
		
		ThisKeyword1 TK2 = new ThisKeyword1();
		TK1.x = 18;
		
		TK1.m1();
		
		TK1.m2();

	}
}

