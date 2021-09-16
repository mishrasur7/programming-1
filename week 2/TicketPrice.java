import java.util.Scanner;
import java.text.DecimalFormat;

public class TicketPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		System.out.print("Enter price for a single ticket: ");
		double singleTicketPrice = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter price for a season ticket: ");
		double seasonTicketPrice = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter the number of bus trips per month: ");
		int totalBusTripsPerMonth = Integer.parseInt(input.nextLine());
		System.out.println();
		double totalMonthlyCostWithSingleTicket = totalBusTripsPerMonth * singleTicketPrice;
		String outPutText;
		if (seasonTicketPrice == totalMonthlyCostWithSingleTicket) {
			outPutText = "There is no difference in the price.";
		} else if (seasonTicketPrice < totalMonthlyCostWithSingleTicket) {
			outPutText = "Buying a season ticket is "
					+ twoDecimals.format((totalMonthlyCostWithSingleTicket - seasonTicketPrice)) + " euros cheaper.";
		} else {
			outPutText = "Buying single tickets is "
					+ twoDecimals.format((seasonTicketPrice - totalMonthlyCostWithSingleTicket)) + " euros cheaper.";
		}
		System.out.println(outPutText);
		input.close();

	}

}
