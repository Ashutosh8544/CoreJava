class SameVariable 
{
	static int a=10;
	public static void main(String[] args) 
	{
		int a=20;
		a=a;
		System.out.println(a);
		System.out.println(SameVariable.a);
	}
}
