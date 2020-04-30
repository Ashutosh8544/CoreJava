class NonStaticMethod{
     int x = 10;
	 void m1(){
		System.out.println(x);
	 }
	public static void main(String[] args) 
	{
		NonStaticMethod nsv1 = new NonStaticMethod();
		NonStaticMethod nsv2= new NonStaticMethod();
		
		System.out.println("Displaying value of  Two different instances  before assigning variables" );
		nsv1.m1();
		nsv2.m1();
		
		System.out.println("Assigning vaue of non static variable");
		nsv1.x = 15;
		nsv2.x = 16;
		
		System.out.println("Displaying value of  Two different instances  after assigning variables" );
		nsv1.m1();
		nsv2.m1();
		

	}
}
