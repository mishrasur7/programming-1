import java.text.DecimalFormat;
import java.util.Scanner;

public class ArrayGrossPayCalculation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		System.out.print("Enter your hourly wage: ");
		double perHourWage = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter the number of days: ");
		int totalDaysWorked = Integer.parseInt(input.nextLine());

		int[] hoursArray = new int[totalDaysWorked];

		for (int i = 0; i < totalDaysWorked; i++) {
			System.out.print("Hours worked on day " + (i + 1) + ": ");
			hoursArray[i] = Integer.parseInt(input.nextLine());
		}

		int totalHours = 0;
		for (int i = 0; i < hoursArray.length; i++) {
			totalHours += hoursArray[i];
		}

		int overTimeHours = 0;
		for (int i = 0; i < hoursArray.length; i++) {
			if (hoursArray[i] > 8) {
				overTimeHours += hoursArray[i] - 8;
			}
		}

		int normalHours = totalHours - overTimeHours; 
		double overTimePerHourPay = perHourWage + perHourWage * 0.5;
		double totalGrossSalary = ((perHourWage * normalHours) + (overTimePerHourPay * overTimeHours));
		System.out.println();
		System.out.println("Total work hours is " + totalHours);
		System.out.println("Gross pay is " + twoDecimals.format(totalGrossSalary));
		System.out.print("You entered the following daily hours: ");

		for (int i = 0; i < hoursArray.length; i++) {
			System.out.print(hoursArray[i] + " ");
		}
		input.close();
	}

}
