import java.text.DecimalFormat;
import java.util.Scanner;

public class ArrayBloodTypes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat oneDecimal = new DecimalFormat("0.0");
		System.out.print("Enter blood type: ");
		String strInput = input.nextLine();
		String[] b = { "A+", "O-", "AB+", "O+", "AB+", "AB+", "O-", "AB+", "O+", "AB+" };

		boolean found = false;
		int count = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i].equals(strInput)) {
				found = true;
				count++;
			}
		}
		double percentage = 0;
		if (found == true) {
			percentage = (count * 100) / b.length;
			System.out.println(oneDecimal.format(percentage) + " %");
		} else {
			System.out.println(oneDecimal.format(percentage) + " %");
		}

		input.close();
	}

}
