package week3;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		String inputString;
		int sum = 0; 
		int count = 0; 
		System.out.print("Enter first string: ");
		inputString = input.nextLine(); 
		while(!inputString.equals("quit")) {
			sum = sum + inputString.length(); 
			System.out.print("Enter a string: ");
			inputString = input.nextLine();
			count++; 
		}
		System.out.println();
		System.out.println("The total length is " + sum);
		input.close();

	}

}
