package week6;

import java.util.Scanner;

public class StringBackwards {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String strInput = input.nextLine();
		String reverseString = reverse(strInput).trim();
		System.out.println(reverseString);

		input.close();

	}

	public static String reverse(String myString) {
		char[] charArray = myString.toCharArray();
		String reverse = "";
		for (int i = myString.length() - 1; i >= 0; i--) {
			reverse += myString.charAt(i);
		}
		return reverse;

	}

}
