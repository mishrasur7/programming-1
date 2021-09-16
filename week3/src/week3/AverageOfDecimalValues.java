package week3;

import java.util.Scanner;
import java.text.DecimalFormat; 

public class AverageOfDecimalValues {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimal = new DecimalFormat("0.00"); 
		double inputDouble;
		double sum = 0.0; 
		int counter = 0; 
		System.out.print("Enter first number (zero ends): ");
		inputDouble = Double.parseDouble(input.nextLine().replace(',', '.'));  
		while(inputDouble != 0) {
			sum = sum + inputDouble; 
			System.out.print("Enter next number (zero ends): ");
			inputDouble = Double.parseDouble(input.nextLine().replace(',', '.'));
			counter++; 
		}
		if(sum > 0) {
			double average = sum / counter; 
			System.out.println("The average is " + twoDecimal.format(average));
		} else {
			System.out.println("Nothing to calculate");
		}
		

	}

}
