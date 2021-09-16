package week6;

import java.util.Scanner;

public class StringCreateUsername {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first name: ");
		String firstName = input.nextLine();
		System.out.print("Enter surname: ");
		String surName = input.nextLine();
		String userNameChecker = createUsername(firstName, surName);
		if (userNameChecker == null) {
			System.out.println("Not enough letters to create a username!");
		} else {
			System.out.println(userNameChecker);
		}

		input.close();

	}

	public static String createUsername(String first, String sur) {
		first = first.toLowerCase();
		sur = sur.toLowerCase();
		if ((first.length() < 2) || (sur.length() < 3)) {
			return null;
		} else {
			String userName = "";
			for (int i = 0; i < 3; i++) {
				userName += sur.charAt(i);
			}
			for (int j = 0; j < 2; j++) {
				userName += first.charAt(j);
			}
			return userName;
		}

	}

}
