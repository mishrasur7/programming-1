package week3;

import java.util.Scanner;

public class ProductOfDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		String strInput = input.nextLine();
		int numInput = Integer.parseInt(strInput);
		int product = 1;
		if (numInput > 0) {
			while (numInput != 0) {
				product = product * (numInput % 10);
				numInput = numInput / 10;
			}
			System.out.println(product);

		} else if (numInput < 0) {
			while (numInput != 0) {
				product = -(product) * (numInput % 10);
				numInput = numInput / 10;
			}
			System.out.println(product);

		} else {
			System.out.println(0);
		}

		input.close();
	}

}
