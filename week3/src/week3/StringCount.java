package week3;

import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String strInput = input.nextLine();
		int count = 0;
		while (strInput != "") {
			
			System.out.print("Enter a string: ");
			strInput = input.nextLine();
			count++;
		}
		System.out.println();
		System.out.println(count + " strings.");
		input.close();
	}

}
