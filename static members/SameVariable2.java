class SameVariable2 
{
	static int a=10;
	public static void main(String[] args) 
	{
		int a=50;
		SameVariable2.a=a;
		System.out.println(a);
		System.out.println(SameVariable2.a);
	}
}
