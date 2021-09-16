package week4;

import java.util.Scanner;
import java.text.DecimalFormat;

public class MethodsThird {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00"); 
		System.out.print("Enter gross salary: ");
		double grossSalary = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter income tax rate: ");
		double taxRate = Double.parseDouble(input.nextLine().replace(',', '.'));
		double netSalary = calculateNetSalary(grossSalary, taxRate);
		System.out.println();
		System.out.println("The net salary is " + twoDecimals.format(netSalary));
		input.close();

	}

	private static double calculateNetSalary(double grossSalary, double taxRate) {
		double netSalary;
		netSalary = grossSalary - (grossSalary * taxRate / 100);
		return netSalary;

	}

}
