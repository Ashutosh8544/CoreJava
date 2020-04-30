package com.as.string;

public class toStringTest {

	public static void main(String[] args) {
		String s1 = "Hari";
		System.out.println("s1:" + s1);//Hari
		
		System.out.println("s1: " + s1.toString());
		System.out.println("_________________________________________");

		String s2 = new String("NareshNIT");
		System.out.println("s2:" + s2);//NareshNIT
		
		System.out.println("s2: " + s2.toString());//NareshNIT
		System.out.println("_________________________________________");

		String s3 = null;
		System.out.println("s3:" + s3);
		
		//System.out.println("s3: " + s3.toString());//RE: NPE
		System.out.println("_________________________________________");

		String s4 = "";
		System.out.println("s4:" + s4);//""
		
		System.out.println("s4: " + s4.toString());//""
		System.out.println("_________________________________________");

		String s5;
		// System.out.println("s5:" + s5);
		// System.out.println("s5: "+ s5.toString());
		System.out.println("s6:"+s6);//null
		System.out.println("_________________________________________");

		Example ex1 = new Example(567);
		System.out.println(ex1);////com.as.string.Example@1f32e575

		Example ex2 = null;
		System.out.println(ex2);//null

		Example ex3;
		//System.out.println("ex3: " + ex3);//CE: The local variable ex3 may not have been initialized
		System.out.println("ex4 :"+ ex4 );//null
	}
	static String s6;
	static Example ex4;
}
