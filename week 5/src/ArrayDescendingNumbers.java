
import java.util.Arrays;

import java.util.Scanner;

public class ArrayDescendingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[] myDouble = new double[4];

		for (int i = 0; i < 4; i++) {
			System.out.print("Enter " + (i + 1) + ". number: ");
			myDouble[i] = Double.parseDouble(input.nextLine().replace(',', '.'));
		}
		
		

		for (int i = 0; i < myDouble.length; i++) {
			for(int j = i; j < myDouble.length; j++) {
				if(myDouble[i] < myDouble[j]) {
					double temp = myDouble[i]; 
					myDouble[i] = myDouble[j]; 
					myDouble[j] = temp; 
				}
			}

		}
		
		for(double a : myDouble) {
			System.out.print(a + " ");
			
		}
		input.close();

	}

}
