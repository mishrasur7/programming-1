import java.util.Scanner;
import java.text.DecimalFormat;

public class AgentCommission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		DecimalFormat twoDecimals = new DecimalFormat("0.00"); 
		System.out.print("Enter selling price: ");
		double price = Double.parseDouble(input.nextLine().replace(',', '.'));
		double commission = price * (3.44/100);
		String outPutText; 
		if(commission <= 2400.00) {
			outPutText = "The commission is 2400,00 euros."; 
		}else {
			outPutText = "The commission is " + twoDecimals.format(commission) + " euros."; 
		}
		System.out.println(outPutText);
		input.close(); 

	}

}
