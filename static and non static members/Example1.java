class  Example1{
	static int a = 10;
	static{
		System.out.println("Example Static block 1");
	}
	static int b = 20;
	static{
		System.out.println("Example Static block 2");
	}
	public static void main(String[] args) 
	{
		System.out.println("Exmaple Main");
	}
	static{
		System.out.println("Example Static block 3");
		System.out.println();
	}
	static int c = 30;
}
