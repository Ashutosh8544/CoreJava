package com.as.nendrasys;

interface inter{
	public int square(int n);
}

public class FunctionalInterfaceTest {

	public static void main(String[] args) {
		inter f = n->n*n;
		System.out.println(f.square(10));
		System.out.println(f.square(20));
 	}
}
