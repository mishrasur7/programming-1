import java.util.Scanner;
import java.text.DecimalFormat;

public class DiscountPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00"); 
		System.out.print("Enter original price: ");
		double price = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter discount percentage: ");
		double discount = Double.parseDouble(input.nextLine().replace(',', '.'));
		double finalPrice = price - (price * discount) / 100;
		System.out.println("The final price is " + twoDecimals.format(finalPrice));
		input.close();
	}

}
