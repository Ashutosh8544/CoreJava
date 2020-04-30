package com.as.string;

public class TrimText {

	public static void main(String[] args) {
		String s1 = "abc bbc     ";
		System.out.println(s1.length());//12
		System.out.println(s1);//"abc bbc      "      
		System.out.println("_______________________________________________________________");
		
		s1.trim();
		System.out.println(s1.length());//12
		System.out.println(s1);//"abc bbc      "
		System.out.println("_______________________________________________________________");
		
		String s2 = s1.trim();
		System.out.println(s1.length());//12
		System.out.println(s2.length());//7
		System.out.println(s1);//"abc bbc      "
		System.out.println("_______________________________________________________________");
		
		String s3 = s2.trim();
		System.out.println(s2.length());//7
		System.out.println(s3.length());//7
		System.out.println(s2==s3);//true
		System.out.println("_______________________________________________________________");
		
		String s4 = s2.replace(" ","");
		String s5 = s2.replace(" ","");
		//String s5 = =s4
		System.out.println(s4.length());//6
		System.out.println(s5.length());//6
		System.out.println(s4==s5);//false
		System.out.println("_______________________________________________________________");
		
		String s6 = s1.trim();
		String s7 = s1.trim();
		System.out.println(s6==s7);//false
	}
}