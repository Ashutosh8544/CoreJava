package com.as.collection;

import java.util.ArrayList;

public class EmployeePrinter {
	public static void print(ArrayList<Employee> al) {
		
		for(int index=0;index<al.size();index++) {
			System.out.println(al.get(index));
		}
	}
}
