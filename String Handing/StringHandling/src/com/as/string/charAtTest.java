package com.as.string;

public class charAtTest {

	public static void main(String[] args) {
		String s1 = "abcdef";
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(3));
		//System.out.println(s1.charAt(6));//RE: String index out of range: 6
		System.out.println(s1.charAt(0));
		//System.out.println(s1.charAt(-1));//RE: String index out of range: -1
		System.out.println(s1.charAt('a'));

	}

}
