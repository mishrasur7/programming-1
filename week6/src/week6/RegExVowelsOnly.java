package week6;

import java.util.Scanner;

public class RegExVowelsOnly {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String strInput = input.nextLine();
		String uppercaseInput = strInput.toUpperCase(); 
		
		if (uppercaseInput.matches("[AEIOUYÅÖÄ]{1,}")) {
			System.out.println("Vowels only");
		} else {
			System.out.println("Not only vowels!");
		}
		input.close();

	}

}
