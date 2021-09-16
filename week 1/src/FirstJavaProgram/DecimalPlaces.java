package FirstJavaProgram;

import java.util.Scanner;
import java.text.DecimalFormat; 

public class DecimalPlaces {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00"); 
		System.out.print("Enter a decimal number: ");
		double decimal = Double.parseDouble(input.nextLine().replace(',' , '.')); 
		System.out.println();
		System.out.println(twoDecimals.format(decimal));
		input.close();
		// TODO Auto-generated method stub

	}

}
