import java.util.Scanner;
import java.math.BigDecimal; 

public class SumOfDecimalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		String firstNumberText = input.nextLine().replace(',', '.');
		System.out.print("Enter second number: ");
		String secondNumberText = input.nextLine().replace(',', '.');
		BigDecimal firstNumber = new BigDecimal(firstNumberText); 
		BigDecimal secondNumber = new BigDecimal(secondNumberText);
		BigDecimal sum = firstNumber.add(secondNumber); 
		System.out.println(sum);
		input.close();

	}

}
