package com.as.string;

import java.util.Scanner;

public class UserNameVlidator {

	public static void main(String[] args) {
		Scanner sc = null;
		String username = null;
		//create Scanner Object
		sc = new Scanner(System.in);
		if(sc!=null) {
			System.out.println("Enter Your username");
			username = sc.nextLine();
			if(username.isEmpty())
				System.out.println("username should not be balnk empty");
			else if(username.isBlank())
					System.out.println("username should not be balnk");
			else		
				System.out.println("Welcome to Naresh IT");
		}
	}
}
