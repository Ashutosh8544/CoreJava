class Example5{
	int x,y;
	void setXY(){
		x = 50; y = 60;	
	}
	void printXY(){
	System.out.println("x:" + x);
	System.out.println("y:" + y);
	}
	void m1(){
		//setXY();
		this.setXY();

		//printXY();
		this.printXY();
	}
	public static void main(String[] args) 
	{
		Example5 e = new Example5();
		e.m1();
	}
}
