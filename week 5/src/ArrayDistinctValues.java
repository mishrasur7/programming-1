import java.util.Arrays;
import java.util.Scanner;

public class ArrayDistinctValues {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of values: ");
		int numInput = Integer.parseInt(input.nextLine());
		int[] numArray = new int[numInput];

		for (int i = 0; i < numInput; i++) {
			System.out.print("Enter an integer: ");
			numArray[i] = Integer.parseInt(input.nextLine());
		}
		
		Arrays.sort(numArray);
		
		for(int i = 0; i < numArray.length -1; i++) {
			if(numArray[i] != numArray[i+1]) {
				System.out.print(numArray[i] + " ");
			}
		}
		System.out.print(numArray[numInput-1] + " ");
		
		input.close();
		

	}

}
