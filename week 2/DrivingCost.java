import java.util.Scanner;
import java.text.DecimalFormat;

public class DrivingCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		System.out.print("Enter driven kilometers: ");
		int kilometersTotal = Integer.parseInt(input.nextLine());
		System.out.print("Enter amount of fuel consumed: ");
		double fuelTotal = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter fuel price per liter: ");
		double fuelUnitPrice = Double.parseDouble(input.nextLine().replace(',', '.'));
		double costPerKilometer = (fuelTotal * fuelUnitPrice) / kilometersTotal; 
		System.out.println();
		System.out.println("The cost per kilometer is " + twoDecimals.format(costPerKilometer) + " euros.");
		

	}

}
