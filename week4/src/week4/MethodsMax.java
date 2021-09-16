package week4;

import java.util.Scanner;

public class MethodsMax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter first double: ");
		double firstDouble = Double.parseDouble(input.nextLine().replace(',', '.')); 
		System.out.print("Enter second double: ");
		double secondDouble = Double.parseDouble(input.nextLine().replace(',', '.'));
		double max = max(firstDouble, secondDouble);
		System.out.println();
		System.out.println("The max value is " + max);
		input.close();

	}
	
	private static double max(double x, double y) {
		double max; 
		if((x-y) > 0) {
			max = x; 
		} else {
			max = y; 
		}
		return max; 
	}

}
