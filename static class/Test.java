class Test1{
	public static void main(String[] args){
		
		System.out.println(StaticClass.a);
		StaticClass1.m1();
		StaticClass2.m1();

		//StaticClass1 sc1 = new StaticClass1();

		StaticClass2 sc2 = new StaticClass2();///CE: StaticClass2() has private access in StaticClass2


	}
}
