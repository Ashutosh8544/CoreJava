class LocalPreference1{
	static int a = 10;
	static int b = 20;
	
	public static void main(String[] args) 
	{
		System.out.println(a);
		System.out.println(b);

		int a = 50;

		System.out.println(a);
		System.out.println(LocalPreference1.a);
		System.out.println(b);
		System.out.println(LocalPreference1.b);


		
			}
}
