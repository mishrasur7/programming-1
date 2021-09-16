import java.util.Arrays;
import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String strInput = input.nextLine();
		
		
		boolean check = isPalindrome(strInput);
		if (check == true) {
			System.out.println("The text is a palindrome.");
		} else {
			System.out.println("No palindrome");
		}
		input.close();
	}

	public static boolean isPalindrome(String string) {
		boolean isPalindrome = false;
		string = string.replaceAll("[\\s,\\.:;?!\\-\'\"]", "").toLowerCase();
		String originalString = string;
		String secondString = "";

		if (string.matches("[a-zåöäA-ZÅÖÄ]{1,}")) {

			for (int i = string.length() - 1; i >= 0; i--) {
				secondString += string.charAt(i);
			}

			if (originalString.equals(secondString)) {
				isPalindrome = true;
			} else {
				isPalindrome = false;
			}

		} else {
			isPalindrome = false;
		}

		return isPalindrome;

	}
}
