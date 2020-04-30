/*
class Sample3 extends Example3{ 
	// Sample3 is not abstract and does not override abstract method m3() in Example3
	void m1(){
		System.out.println("m1() method of Sample3");
	}
}
*/
abstract class Sample3 extends Example3{ 
	void m1(){
		System.out.println("m1() method of Sample3");
	}
	void m2(){
		System.out.println("m2() method of sample3");
	}
	void m3(){
		System.out.println("m2() method of sample3");
	}
}
