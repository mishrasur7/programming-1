package week3;

import java.util.Scanner;

public class DescendingIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int inputInteger = Integer.parseInt(input.nextLine()); 
		for(int i = inputInteger; i >= 1; i--) {
			System.out.print(i + " ");
		}
		input.close();

	}

}
