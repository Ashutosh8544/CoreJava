package com.as.string;

import java.util.Arrays;

//public String[] split(String delim)
public class SplitMTTest {

	public static void main(String[] args) {
		String s1 = "Love Programming";
		System.out.println(s1);
		System.out.println();
		
		String[] sa1 = s1.split(" ");
		System.out.println("length:: "+sa1.length);
		System.out.println(Arrays.toString(sa1));
		System.out.println();
		
		String[] sa2 = s1.split("P");
		System.out.println("length:: "+sa2.length);
		System.out.println(Arrays.toString(sa2));
		System.out.println();
		
		String[] sa3 = s1.split("m");
		System.out.println("length:: "+sa3.length);
		System.out.println(Arrays.toString(sa3));
		System.out.println();
		
		String[] sa4 = s1.split("R");
		System.out.println("length:: "+sa4.length);
		System.out.println(Arrays.toString(sa4));
		System.out.println();
		
		String[] sa5 = s1.split("L");
		System.out.println("length:: "+sa5.length);
		System.out.println(Arrays.toString(sa5));
		System.out.println();
		
		String[] sa6 = s1.split("v");
		System.out.println("length:: "+sa6.length);
		System.out.println(Arrays.toString(sa6));
		System.out.println();
		
		s1 = "abc abc abc";
		String[] sa7 = s1.split("c");
		System.out.println("length:: "+sa7.length);
		System.out.println(Arrays.toString(sa7));
		System.out.println();
		
		String[] sa8 = s1.split("a");
		System.out.println("length:: "+sa8.length);
		System.out.println(Arrays.toString(sa8));
		System.out.println();
		
		String[] sa9 = s1.split("abc");
		System.out.println("length:: "+sa9.length);
		System.out.println(Arrays.toString(sa9));
		System.out.println();
		
		String[] sa10 = s1.split("abc,abc,abc");
		System.out.println("length:: "+sa10.length);
		System.out.println(Arrays.toString(sa10));
		System.out.println();
		
		s1 = "abc.txt";
		String[] sa11 = s1.split(".");
		System.out.println("length:: "+sa11.length);
		System.out.println(Arrays.toString(sa11));
		System.out.println();
		
		String[] sa12 = s1.split("\\.");
		System.out.println("length:: "+sa12.length);
		System.out.println(Arrays.toString(sa12));
		System.out.println();
		
		String[] sa13 = s1.split("");
		System.out.println("length:: "+sa13.length);
		System.out.println(Arrays.toString(sa13));
		System.out.println();
		
		String s2 = "aa";
		String[] sa14 = s2.split("a");
		System.out.println("length:: "+sa14.length);
		System.out.println(Arrays.toString(sa14));
		System.out.println();
		
		String s3 = "aabc aabc";
		String[] sa15 = s3.split("a");
		System.out.println("length:: "+sa15.length);
		System.out.println(Arrays.toString(sa15));
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
