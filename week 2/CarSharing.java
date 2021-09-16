import java.util.Scanner;
import java.text.DecimalFormat;

public class CarSharing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00"); 
		System.out.print("Enter driven kilometers: ");
		int drivenKilometers = Integer.parseInt(input.nextLine()); 
		System.out.print("Enter fuel consumption per 100 km: ");
		double fuelConsumptionPer100km = Double.parseDouble(input.nextLine().replace(',', '.')); 
		System.out.print("Enter fuel price per liter: ");
		double fuelPricePerLiter = Double.parseDouble(input.nextLine().replace(',', '.')); 
		System.out.print("Enter number of people: ");
		int totalPeople = Integer.parseInt(input.nextLine()); 
		double totalFuelConsumption = (fuelConsumptionPer100km * drivenKilometers) / 100; 
		double totalFuelCost = totalFuelConsumption * fuelPricePerLiter; 
		double costPerHead = totalFuelCost / totalPeople;
		System.out.println();
		System.out.println("Each of the " + totalPeople + " people should pay " + twoDecimals.format(costPerHead) + " euros.");
		input.close();

	}

}
