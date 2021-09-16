import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayStatistics {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat oneDecimal = new DecimalFormat("0.0");
		System.out.print("Enter the number of values: ");
		int numInput = Integer.parseInt(input.nextLine());

		int[] staticsArray = new int[numInput];
		
		if(numInput < 3) {
			System.out.println("Sorry, at least 3 values required");
		} else {
			for (int i = 0; i < staticsArray.length; i++) {
				System.out.print("Enter an integer: ");
				staticsArray[i] = Integer.parseInt(input.nextLine());
			}
			int[] newArray = Arrays.copyOf(staticsArray, numInput); 
			System.out.println();
			System.out.println("n = " + numInput);
			System.out.println("Min: " + ArrayStatLibrary.min(staticsArray));
			System.out.println("Max: " + ArrayStatLibrary.max(staticsArray));
			System.out.println("Median: " + oneDecimal.format(ArrayStatLibrary.median(newArray)));
			System.out.println("Mean: " + oneDecimal.format(ArrayStatLibrary.mean(staticsArray)));
			System.out.println("Sample standard deviation: " + oneDecimal.format(ArrayStatLibrary.standardDeviation(staticsArray)));
			System.out.print("Sample data: ");
			
			for (int i = 0; i < staticsArray.length; i++) {
				System.out.print(staticsArray[i] + " ");
			}
		}
		
		input.close();
	}

}
