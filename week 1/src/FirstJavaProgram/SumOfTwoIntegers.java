package FirstJavaProgram;

import java.util.Scanner;

public class SumOfTwoIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first integer:");
		String firstInteger = input.nextLine();
		System.out.print("Enter second integer:");
		String secondInteger = input.nextLine();
		int firstInt = Integer.parseInt(firstInteger);
		int secondInt = Integer.parseInt(secondInteger);
		int sum = firstInt + secondInt;
		System.out.println(firstInteger + " + " + secondInteger + " = " + sum);
		input.close();

		// TODO Auto-generated method stub

	}

}
