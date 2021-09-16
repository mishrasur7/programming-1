package week6;

import java.util.Scanner;

public class StringWarmUp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter a string: ");
		String strInput = input.nextLine(); 
		int length = strInput.length(); 
		String upperCase = strInput.toUpperCase(); 
		String lowerCase = strInput.toLowerCase(); 
		System.out.println(length + " characters");
		System.out.println(upperCase);
		System.out.println(lowerCase);
		input.close();

	}

}
