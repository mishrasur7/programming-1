package week3;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num; 
		String strInput;
		int factorial = 1; 
		System.out.print("Enter a non-negative integer: ");
		strInput = input.nextLine();
		try {
			num = Integer.parseInt(strInput); 
			if(num < 0) {
				System.out.println("Please enter a non-negative integer.");
			} else if(num == 0) {
				System.out.println(num + "! = " + 1);
			} else {
				for(int i = 1; i <= num; i++) {
					factorial *= i ; 
				}
				System.out.print(num + "! = " + factorial);
			}
		} catch(NumberFormatException nfe) {
			System.out.println("Please enter a non-negative integer.");
		}
		input.close();
		
		
		
		
	

	}

}
