package com.as.collection;

public class MYCollectionTest {

	public static void main(String[] args) {
		
		MyCollection coll = new MyCollection();
		System.out.println("capacity:"+coll.capacity());
		System.out.println("size:"+coll.size());
		coll.add("ashu");
		coll.add(546);
		coll.add(546.0f);
		coll.add(546.22D);
		coll.add(453L);
		coll.add(true);
		coll.add(null);
		coll.add(new Example(10,20));
		coll.add("ashu");
		coll.add("546");
		coll.add("shweta");
		coll.add("ashu");
		coll.add(546);
		coll.add(546.0f);
		coll.add(546.22D);
		coll.add(453L);
		coll.add(true);
		coll.add(null);
		coll.add(new Example(10,20));
		coll.add("ashu");
		coll.add("546");
		coll.add("shweta");

		coll.remove(5);
		System.out.println(coll);
		System.out.println("=========================================================================");
		System.out.println("capacity:"+coll.capacity());
		System.out.println("size:"+coll.size());

	}

}
