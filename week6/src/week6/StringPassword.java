package week6;

import java.util.Scanner;

public class StringPassword {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter username: ");
		String userName = input.nextLine();
		System.out.print("Enter password: ");
		String password = input.nextLine();
		boolean isValid = validatePassword(userName, password);
		if (isValid == true) {
			System.out.println("OK");
		} else {
			System.out.println("NOT OK");
		}

		input.close();

	}

	public static boolean validatePassword(String u, String p) {
		u = u.toLowerCase(); 
		p = p.toLowerCase(); 
		if ((p.length()) < 8 || (p.contains(u))) {
			return false;
		} else {
			return true;
		}
	}

}
