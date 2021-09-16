package week3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CompoundInterest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimal = new DecimalFormat("0.00"); 
		System.out.print("Enter initial deposit: ");
		double balance = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter interest rate: ");
		double interestRate = Double.parseDouble(input.nextLine().replace(',', '.'));
		interestRate = interestRate / 100;
		System.out.print("Enter capital income tax rate: ");
		double taxRate = Double.parseDouble(input.nextLine().replace(',', '.'));
		taxRate = taxRate / 100;
		System.out.print("Enter number of years: ");
		int years = Integer.parseInt(input.nextLine());
		double interest;  
		double tax;  
		double interestGained; 
		for (int i = 1; i <= years; i++) {
			 interest = balance * interestRate;
			 tax = interest * taxRate;
			 interestGained = interest - tax;
			 balance = balance + interestGained; 
			 
			System.out.println(i + ": " + twoDecimal.format(balance));
		}
		input.close();

	}

}
