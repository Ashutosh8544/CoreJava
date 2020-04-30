package com.as.string;

public class JoinTest {

	public static void main(String[] args) {
		String s1 = String.join("-", "a", "b", "c", "d", "e");
		String s2 = String.join("", "a", "b", "c", "d");
		String s3 = String.join("-");
		String s4 = String.join("-", "a");
		String s5 = String.join("-", "a", "b");
		String s6 = String.join("-", new StringBuffer("b"), new StringBuffer("c"));
		System.out.println("s1: " + s1);//a-b-c-d-e
		System.out.println("s2: " + s2);//abcd
		System.out.println("s3: " + s3);//
		System.out.println("s4: " + s4);//a
		System.out.println("s5: " + s5);//a-b
		System.out.println("s6: " + s6);//b-c
		System.out.println("========================================================");

		// performance
		String s7 = "p";
		String s8 = s7 + "q";
		// =>new StrinBuilder().append(s7).append("q").toString();
		System.out.println(s8);//pq
		System.out.println("========================================================");
		
		String s9 = s8.concat("q");
		String s10 = "a"+"b"+"c"+"d";//abcd
		String s11 = "a".concat("b").concat("c").concat("d");//abcd
		String s12 = String.join("", "a", "b", "c", "d");//abcd
		String s13 = String.join("-", "a", "b", "c", "d");//a-b-c-d
		
		System.out.println(s9);//pqq
		System.out.println(s10);//abcd
		System.out.println(s11);//abcd
		System.out.println(s12);//abcd
		System.out.println(s13);//a-b-c-d
		System.out.println("========================================================");
		
		String s14 = String.join("-", "null");
		String s15 = String.join("-", "null","null");
		
		//String s15 = String.join("-", null);
		System.out.println(s14);//null
		System.out.println(s15);//null-null
		
		
	}
}