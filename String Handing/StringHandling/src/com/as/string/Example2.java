package com.as.string;

public class Example2 {
	int x;
	public Example2(int x) {
		this.x = x;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Example2) {
			Example2 e = (Example2) obj; 
			return(this.x==e.x);
		}
		return false;
	}
}
