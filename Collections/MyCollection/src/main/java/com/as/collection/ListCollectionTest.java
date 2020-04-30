package com.as.collection;

import java.util.ArrayList;
import java.util.List;

public class ListCollectionTest {

	public static void main(String[] args) {
		List list = null;
		//creating ArrayList object
		list = new ArrayList();
		//adding elements in ArrayList Collection
		System.out.println("Capacity:: "+ list.size());
		list.add("ashu");
		list.add(45);
		list.add(4.45f);
		list.add(new Example(4,5));
		list.add(true);
		list.add(null);
		list.add('a');
		list.add(null);
		list.add("ashu");
		list.add(new Example(4,5));
		System.out.println(list);
		
		
	}

}
