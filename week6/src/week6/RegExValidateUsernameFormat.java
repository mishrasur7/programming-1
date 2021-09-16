package week6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExValidateUsernameFormat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter username: ");
		String strInput = input.nextLine();
		 
		
		if(strInput.matches("[a-z]{1}[0-9]{7}@(myy)\\.(haaga)-(helia)\\.(fi)")) {
			System.out.println("OK");
		} else 
			System.out.println("Invalid username format");
		input.close();

	}

}
