package com.as.string;

public class ChangeCaseTest {

	public static void main(String[] args) {
		String s1 = "aBc";
		System.out.println(s1);//aBc
		s1.toUpperCase();//ABC
		System.out.println(s1);//aBc
		System.out.println("_______________________________________________________________________");
		
		String s2 = s1.toUpperCase();
		String s3 = s1.toLowerCase();
		System.out.println(s2);//ABC
		System.out.println(s3);//abc
		System.out.println("_______________________________________________________________________");
		
		s1 = s1.toUpperCase();
		System.out.println(s1);//ABC
		s1 = s1.toLowerCase();
		System.out.println(s1);//abc
		System.out.println("_______________________________________________________________________");
		
		String s4 = s1.toLowerCase();
		System.out.println(s1);//abc
		System.out.println(s4);//abc
		System.out.println("_______________________________________________________________________");
		
		String s5 = s1.toUpperCase(); //ABC
		String s6 = s1.toUpperCase();//ABC
		System.out.println(s1);//abc
		System.out.println(s5);//ABC
		System.out.println(s6);	//ABC
		System.out.println(s1==s5);//false
		System.out.println(s5==s6);//false
		System.out.println(s1.equals(s5));//false
		System.out.println(s1.equals(s6));//false
		System.out.println("_______________________________________________________________________");
		
		String s7 = "12@34";
		String s8 = s7.toLowerCase();//12@34
		String s9 = s7.toUpperCase();//12@34
		System.out.println(s7);//12@34
		System.out.println(s8);//12@34
		System.out.println(s9);//12@34
		System.out.println(s7==s8);//true
		System.out.println(s7==s9);//true
		System.out.println(s8==s9);////true
		System.out.println("_______________________________________________________________________");
		
		String s10 = "PqR";
		String s11 = s10.toLowerCase(); //pqr
		String s12 = s10.toUpperCase(); //PQR
		
		System.out.println(s10.toUpperCase());//PQR
		System.out.println(s10);//PqR
		System.out.println("_______________________________________________________________________");
		
		String s13 = null;
		//System.out.println(s13.toUpperCase());//NPE
		
		String s14 = "null";
		System.out.println(s14.toUpperCase());//NULL
		String[] sa = new String[5];
		//System.out.println(sa[0].toUpperCase());//NPE
	}
}
