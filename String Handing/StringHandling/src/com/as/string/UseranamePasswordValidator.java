package com.as.string;

import java.util.Scanner;

public class UseranamePasswordValidator {
	boolean on1 = false;
	boolean on2 = false;

	public String username(String username) throws UserNotFoundException {
		if (username.isEmpty()) {
			try {
				throw new UserNotFoundException("username should not be balnk empty");
			} catch (UserNotFoundException unfe) {
				System.out.println(unfe.getMessage());
				return username;
			}
		} else if (username.isBlank())
			try {
				throw new UserNotFoundException("username should not be balnk");
			} catch (UserNotFoundException unfe) {
				System.out.println(unfe.getMessage());
				return username;
			}
		else {
			
			return "Welcome to Naresh IT";
		}
	}
	public String password(String password) throws PasswordNotFoundException {
		int len = 0;
		char ch = ' ';
		boolean upperFound = false;
		boolean spaceFound = false;
		boolean digitFound = false;
		int index = 0;
		len = password.length();
		if (len < 8 || len > 16) {
			try {
				throw new PasswordNotFoundException("Password must have 8-16 characters");
			} catch (PasswordNotFoundException pnfe) {
				System.out.println(pnfe.getMessage());
				return password;
			}
		} else {
			password = password.trim();
			if (password.isEmpty())
				try {
					throw new PasswordNotFoundException("Password can not blank space");
				} catch (PasswordNotFoundException pnfe) {

					System.out.println(pnfe.getMessage());
					return password;
				}
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
					on2 = true;
					return "valid password";

				} else {
					try {
						throw new PasswordNotFoundException("Invalid password \n"
								+ "password must contain one Upper case," + " one digit, one special character");
					} catch (PasswordNotFoundException pnfe) {
						System.out.println(pnfe.getMessage());
						return password;
					}
				}
			} // for
		}
	}

	public void userDetails() throws UserNotFoundException, PasswordNotFoundException {
		Scanner sc = null;
		String username = null;
		String password = null;
		sc = new Scanner(System.in);
		if (sc != null) {
			System.out.println("Enter username");
			username = sc.nextLine();
			System.out.println("Enter password");
			password = sc.nextLine();
			UseranamePasswordValidator upv = new UseranamePasswordValidator();
			upv.username(username);
			upv.password(password);
		}
	}

	public static void main(String[] args) throws UserNotFoundException, PasswordNotFoundException {
		UseranamePasswordValidator upv = new UseranamePasswordValidator();
		upv.userDetails();
		
	}
}
