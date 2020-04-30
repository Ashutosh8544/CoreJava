class Example7{
	int x = 10;
	int y = 20;
	void m1(int a , int b){
		x = a;
		y = b;		
	}
	void m2(int x , int y){
		x = x;
		y = y;		
	}
	void m3(int x , int y){
		this.x = x;
		this.y = x;		
	}
	public static void main(String[] args){
		Example7 e1 = new Example7();
		System.out.println(e1.x + "..." + e1.y);
		e1.m1(30,40);
		System.out.println(e1.x + "..." + e1.y);
		e1.m2(50,60);
		System.out.println(e1.x + "..." + e1.y);
		e1.m1(70,80);
		System.out.println(e1.x + "..." + e1.y);
	}
}