package com.as.string;

public class ReplaceTest {

	public static void main(String[] args) {
		String s1 = "abc abc abc";
		System.out.println(s1);//abc abc abc
		System.out.println("__________________________________________________________________");

		s1.replace('a', 'b');
		System.out.println(s1);//abc abc abc
		System.out.println("__________________________________________________________________");

		String s2 = s1.replace('a', 'b');
		System.out.println(s1);//abc abc abc
		System.out.println(s2);//bbc bbc bbc
		System.out.println("__________________________________________________________________");

		String s3 = s1.replaceFirst("a", "b");
		System.out.println(s1);//abc abc abc
		System.out.println(s3);//bbc abc abc
		System.out.println("__________________________________________________________________");

		s1 = s1.replace('a', 'd');
		System.out.println(s1);//dbc dbc dbc
		System.out.println("__________________________________________________________________");

		String s4 = s1.replace('a', 'e');
		System.out.println(s1);//dbc dbc dbc
		System.out.println(s4);//dbc dbc dbc
		System.out.println(s1 == s4);//true
		System.out.println("__________________________________________________________________");

		String s5 = s1.replace("D", "e");
		System.out.println(s1);//dbc dbc dbc
		System.out.println(s5);//dbc dbc dbc
		System.out.println(s1 == s5);//true
		System.out.println("__________________________________________________________________");

		String s6 = "abc.txt";
		String s7 = s6.replace(".", "#");
		System.out.println(s6);//abc.txt
		System.out.println(s7);//abc#txt
		System.out.println("__________________________________________________________________");

		String s8 = s6.replaceAll(".", "#");
		System.out.println(s8);//#######
		System.out.println("__________________________________________________________________");

		String s9 = s6.replaceFirst(".", "#");
		System.out.println(s9);//#bc.txt
		System.out.println("__________________________________________________________________");

		String s10 = s6.replaceAll("\\.", "#");
		System.out.println(s10);//#######
		System.out.println("__________________________________________________________________");

		String s11 = s6.replaceFirst("\\.", "#");
		System.out.println(s11);//abc#txt
		System.out.println("__________________________________________________________________");

		String s12 = "abc$bbc?cbc";
		String s13 = s12.replaceAll("\\$", " ");
		String s14 = s13.replaceAll("\\?", "@");
		System.out.println(s12);//abc$bbc?cbc
		System.out.println(s13);//abc bbc?cbc
		System.out.println(s14);//abc bbc@cbc
		System.out.println("__________________________________________________________________");
		
		String s19 = "MotherInLaw and HitlerWoman";
		String s20 = s19.replaceAll("\\s", "");
		String s21 = s20.replaceAll("\\s", "");
		System.out.println(s19);//MotherInLaw and HitlerWoman
		System.out.println(s20);//MotherInLawandHitlerWoman
		System.out.println(s21);//MotherInLawandHitlerWoman
		System.out.println("__________________________________________________________________");
		

		String s15 = "abc";
		String s16 = s15.replace('a', 'b');
		String s17 = s15.replace('a', 'b');
		String s18 = s17.replace('a', 'b');
		System.out.println(s16 == s17);//false
		System.out.println(s17 == s18);//true
		System.out.println(s16.equals(s17));//true
	}
}
