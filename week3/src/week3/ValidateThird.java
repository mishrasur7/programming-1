package week3;

import java.util.Scanner;

public class ValidateThird {

	public static void main(String[] args) {
		// lets initialize some variables that later we use in our program
		int num;
		String strInput;
		boolean valid = false;
		// setup scanner
		Scanner input = new Scanner(System.in);
		while (valid == false) {
			// prompt the user
			System.out.print("Enter grade (0-5): ");
			// take the user input
			strInput = input.nextLine();
			// Try to convert string to integer
			try {
				num = Integer.parseInt(strInput); 
				if(num < 0 || num > 5) {
					System.out.println(num + " is not a valid grade."); 
				} else {
					valid = true; 
				}
			} catch (NumberFormatException nfe) {
				System.out.println(strInput + " is not a valid grade.");

			}
		}
		
		System.out.println("OK");
		input.close();
	

	}

}
