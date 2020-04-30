package com.as.string;

import java.util.Scanner;

public class PasswordValidator {

	public static void main(String[] args) {
		Scanner sc = null;
		String password = null;
		int index = 0;
		int len = 0;
		char ch = ' ';
		boolean upperFound = false;
		boolean spaceFound = false;
		boolean digitFound = false;
		// create Scanner object
		sc = new Scanner(System.in);
		if (sc != null) {
			System.out.println("Enter your password::");
			password = sc.nextLine();// Ashutosh@1j
			len = password.length();// 10
			if (len < 8 || len > 16) {
				System.out.println("Password must have 8-16 characters");
			} else {
				password = password.trim();
				if (password.isEmpty())
					System.out.println("Password can not blank space");
				else {
					for (index = 0; index < len; index++) {
						ch = password.charAt(index);
						if (Character.isLetter(ch)) {
							if (Character.isUpperCase(ch))
								upperFound = true;
						} else if (Character.isDigit(ch))
							digitFound = true;
						else if (!Character.isWhitespace(ch))
							spaceFound = true;
					}
					if (upperFound & digitFound & spaceFound) {
						
						System.out.println("valid password");
					} else {
						System.out.println("Invalid password");
						System.out.println("password must contain one Upper case, one digit, one special character");
					}
				} // for
			}
			
		}
	}
}
