import java.util.Scanner;

public class StringDecimalPartLength {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		String strInput = input.nextLine();

		try {
			double doubleInput = Double.parseDouble(strInput.replace(',', '.'));
			if (strInput.matches("[0-9]{1,}[.][0-9]{1,}")) {
				int index = strInput.indexOf(".");
				int noOfDecimals = (strInput.length() - 1) - index;
				System.out.println(noOfDecimals + " decimal place(s)");
			} else if (strInput.matches("[0-9]{1,}[,][0-9]{1,}")) {
				int index = strInput.indexOf(",");
				int noOfDecimals = (strInput.length() - 1) - index;
				System.out.println(noOfDecimals + " decimal place(s)");
			} else {
				System.out.println("Please enter a proper decimal number");
			}

		} catch (NumberFormatException nfe) {
			System.out.println("Please enter a proper decimal number");
		}
		input.close();

	}

}
