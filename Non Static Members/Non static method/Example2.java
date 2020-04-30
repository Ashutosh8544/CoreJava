class Example2{

	int x = 10;
	void m1(){
		System.out.println(x);
	}
		
	  void m2(){
		System.out.println(x);
    	}


	public static void main(String[] args){
		
		Example2 e1 = new Example2();
		System.out.println(e1.x);	

		e1.m1();
		
	}
}