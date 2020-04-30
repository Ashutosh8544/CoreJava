package com.as.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List l = null;
		// creating ArrayList Obj
		l = new ArrayList();
		if (l != null) {
			System.out.println("ArrayList size:: " + l.size());
			System.out.println(l);
			System.out.println();

			l.add(45);
			l.add("ashu");
			l.add(4.56);
			l.add(34.5f);
			l.add(true);
			l.add(null);
			l.add(new Example(5, 6));
			l.add("ashu");
			l.add(null);
			l.add(false);
			l.add(new Example(5, 6));
			System.out.println("ArrayList size:: " + l.size());
			System.out.println(l);
			System.out.println();

			

		}
	}

}
