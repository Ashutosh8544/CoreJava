package com.as.string;

public class equealTest {

	public static void main(String[] args) {
		String s1 = "a";
		String s2 = "a";
		String s3 = new String("a");
		String s4 = new String("a");

		StringBuffer sb1 = new StringBuffer("a");
		StringBuffer sb2 = new StringBuffer("a");
		System.out.println(s1 == s2);// true
		System.out.println(s3 == s4);//// true
		System.out.println(sb1 == sb2);// false
		System.out.println("_________________________________________________");
		System.out.println(s1.equals(s2));// false
		System.out.println(s3.equals(s4));// false
		System.out.println(sb1.equals(sb2));//true
		System.out.println("_________________________________________________");

		String s5 = "a";
		String s6 = "A";
		System.out.println(s5 == s6);//false
		System.out.println(s5.equals(s6));//false
		System.out.println(s5.equalsIgnoreCase(s6));///true
		System.out.println("_________________________________________________");

		Example2 e1 = new Example2(5);
		Example2 e2 = new Example2(5);
		Example2 e3 = new Example2(5);
		Example2 e4 = e3;
		System.out.println(e1 == e2);//false
		System.out.println(e2 == e3);//false
		System.out.println(e3 == e4);//true
		System.out.println("_________________________________________________");
		System.out.println(e1.equals(e2));//true
		System.out.println(e2.equals(e3));//true
		System.out.println(e3.equals(e4));//true

		Sample sa1 = new Sample();
		// System.out.println(e1==s1);//CE: incompitable types
		System.out.println(e1.equals(sa1));//false
		System.out.println(sa1.equals(e1));//false
		System.out.println("_________________________________________________");

		System.out.println(sa1 == null);//false
		System.out.println(sa1.equals(null));//false
		System.out.println(e1 == null);//false
		System.out.println(e1.equals(null));// false
	}
}
