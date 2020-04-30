package com.as.collection;

import java.util.Arrays;

public class MyCollection {

	// meant for storing collections objects
	private Object[] objArray = new Object[10];

	// maintanance array index and size
	private int index = 0;

	public void add(Object obj) {
		if (size() == capacity()) {
			incrementCapacity();
		}
		objArray[index] = obj;
		index++;
	}

	public int size() {
		return index;
	}

	public int capacity() {
		return objArray.length;
	}

	private void incrementCapacity() {
		int i;
		Object[] tempArray = new Object[capacity() * 2];
		for (i = 0; i < objArray.length; i++) {
			tempArray[i] = objArray[i];
		}
		objArray = tempArray;
	}

	public Object get(int i) {
		return objArray[i];
	}

	public void replace(int i, Object obj) {
		objArray[i] = obj;
	}

	public void remove(int i) {
		for (; i < size() - 1; i++) {
			objArray[i] = objArray[i + 1];
		}
		objArray[i] = null;
		index--;
	}

	public void insert(int i, Object obj) {
		if (size() == capacity()) {
			incrementCapacity();
		}
		for (i = size() - 1; i >= i; i--) {
			objArray[i + 1] = objArray[i];
		}
		objArray[i] = obj;
		index++;
	}

	// meant for displaying the objects those are added to collection.
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < size(); i++) {
			sb.append(objArray[i]);
			sb.append(",");
		}
		// deleting last comma and space
		int start = sb.lastIndexOf(",");
		if (start != -1) {
			sb.delete(start, start + 2);
		}
		sb.append("]");
		return sb.toString();
	}
}