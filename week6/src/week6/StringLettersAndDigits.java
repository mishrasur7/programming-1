package week6;

import java.util.Scanner;

public class StringLettersAndDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter a string: ");
		String strInput = input.nextLine(); 
		
		char[] charArray = strInput.toCharArray(); 
		
		int letters = 0; 
		int digits = 0; 
		for(int i = 0; i < charArray.length; i++) {
			if(Character.isDigit(charArray[i])) {
				digits++; 
				
			} else if(Character.isLetter(charArray[i])) {
				letters++; 
			}
		}
		System.out.println(letters + " letter(s)");
		System.out.println(digits + " digit(s)");
		input.close();
	}

}
