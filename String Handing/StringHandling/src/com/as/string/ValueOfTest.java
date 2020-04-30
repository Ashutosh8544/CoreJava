package com.as.string;
//public String valueOf(XXX value)
public class ValueOfTest {

	public static void main(String[] args) {
		System.out.println(String.valueOf(10));
		System.out.println(String.valueOf(10.56));
		System.out.println(String.valueOf('a'));
		System.out.println(String.valueOf(true));
		System.out.println(String.valueOf("abc"));
		System.out.println(String.valueOf(new char[]{'a','b'}));
		System.out.println(String.valueOf(null));
		System.out.println(String.valueOf((String)null));
		System.out.println(String.valueOf((A)null));
		System.out.println(String.valueOf(new A()));
		System.out.println(String.valueOf(new B()));
		System.out.println(String.valueOf(new Example(56)));
		
	}
}
class A{}
class B{
	@Override
	public String toString() {
		return "hii";
	}
}

class Example{
	int x;
	public Example(int x) {
		this.x = x;
	}
	String m1() {
		return
		//""+x;
		//Integer.toString(x);
		
		String.valueOf(x);
	}
}
