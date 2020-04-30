class Example4{//types of constructor
	int x = 10, y= 20;
	Example4(){
		x = 30;
		y = 40;
	}
	Example4(int x , int y){
		this.x = x;
		this.y = y;
	}
	public static void main(String[] args){
		Example4 e1 = new Example4();
		System.out.println("e1.x\t" + e1.x + "\te1.y\t" + e1.y);
		Example4 e2 = new Example4();
		System.out.println("e2.x\t" + e2.x + "\te2.y\t" + e2.y);
		Example4 e3 = new Example4();
		System.out.println("e3.x\t" + e3.x + "\te3.y\t" + e3.y);
		Example4 e4 = new Example4();
		System.out.println("e4.x\t" + e4.x + "\te4.y\t" + e4.y);
		Example4 e5 = new Example4(5,6);
		System.out.println("e5.x\t" + e5.x + "\te5.y\t" + e5.y);
		Example4 e6 = new Example4(5,6);
		System.out.println("e6.x\t" + e6.x + "\te6.y\t" + e6.y);
		Example4 e7 = new Example4(7,8);
		System.out.println("e7.x\t" + e7.x + "\te7.y\t" + e7.y);
	}
}
