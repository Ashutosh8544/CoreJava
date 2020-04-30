class Sample extends Example4{
		void m1(Integer i){
			System.out.println("Integer-args");
		}
	public static void main(String [] args){
		Sample s = new Sample();
		s.m1(10);
		s.m1(new Integer(10));

		Example4 e = new Example4();
		e.m1(10);
		e.m1(new Integer(10));
		e.m1(new Integer(10).intValue());
	}
}
