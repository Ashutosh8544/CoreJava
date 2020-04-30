class Sample3 extends Example3{
	int x =30;
	int y = 40;
	void m2(){
		System.out.println("x:"  +  x);
		System.out.println("y:"  +  y);
		System.out.println("super.x:"  +  super.x);
		System.out.println("super.y:"  +  super.y);
	}
	void m3(){
		int x =50;
		int y = 60;
		System.out.println("local x:"  +  x);
		System.out.println("local y:"  +  y);
		System.out.println("this.x:"  +  this.x);
		System.out.println("this.y:"  +  this.y);
		System.out.println("super.x:"  +  super.x);
		System.out.println("super.y:"  +  super.y);

	}
	public static void main(String[] args){
		Sample3 s = new Sample3();
		s.m2();
		s.m3();
	}
}
