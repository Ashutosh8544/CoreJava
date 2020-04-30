package com.as.string;

public class StringConstructorTest {

	public static void main(String[] args) {
		String sl = "ashutosh seth";
		// No parameter String constructor
		String s1 = new String("s1:: ");
		// creating string with direct literals
		String s2 = new String("ashu");
		System.out.println(s1 == s2);
		System.out.println("s2:: " + s2);

		StringBuffer sb1 = new StringBuffer("ashu");
		String s3 = new String(sb1);
		System.out.println("s3:: " + s3);

		StringBuilder sb2 = new StringBuilder("ashu");
		String s4 = new String(sb2);
		System.out.println("s4:: " + s4);

		// perorming string copy operation from char[] tp String
		char[] ch1 = { 'a', 's', 'h', 'u' };
		String s5 = new String(ch1);
		System.out.println("s5:: " + s5);

		byte[] b1 = { 97, 98, 10, 56, 78 };
		String s6 = new String("b1:: " + b1);
		System.out.println("s6:: " + s6);

		// copy string
		String s7 = new String(sl);
		System.out.println("s7:: " + s7);

		// String assignment
		String s8 = s7;
		System.out.println("s8:: " + s8);

		// String(char[]ch,int offset,int count)
		char[] ch2 = { 'a', 'b', 'c', 'd', 'e' };
		String s9 = new String(ch2, 2, 3);
		System.out.println("s9:: " + s9);// cde

		// String(byte[] b,int offset,int count)
		byte[] b = { 45, 87, 65, 12, 78 };
		String s10 = new String(ch2, 2, 3);
		System.out.println("s9:: " + s9);// cde

	}

}
