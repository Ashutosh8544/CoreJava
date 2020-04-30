class  Example{
	static void m1(int a){
		System.out.println("int-args");
	}
	static void m1(Integer a){
		System.out.println("Integer-args");
	}
	public static void main(String[] args){
		m1(50);
		m1('a');
		m1(new Integer(50));
		m1(new Character('a'));
//		m1(new Long(70));	// CE: no suitable method found for m1(Long)
	}
}
