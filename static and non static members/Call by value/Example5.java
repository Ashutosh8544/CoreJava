class Example5{//Call by value
		void m1(int p){
			p = 60;
		}
	public static void main(String[] args){
		Example5 e1 = new Example5();
		int x = 50;
		e1.m1(x);
		System.out.println(x);

	}
}
