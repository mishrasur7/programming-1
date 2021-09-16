package week3;

import java.util.Scanner;

public class PositiveOddIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive odd integer: ");
		String strInput = input.nextLine();
		boolean valid = false; 
		while (valid == false) {
			try{
				int num = Integer.parseInt(strInput);
				if ((num % 2 != 1) || (num < 0)){
					System.out.println("  " + num + " is not a positive odd integer");
					System.out.println();
					System.out.print("Enter a positive odd integer: ");
					strInput = input.nextLine(); 
					num = Integer.parseInt(strInput); 
					
				} else {
					System.out.println("  OK");
					System.out.println();
					System.out.print("Enter a positive odd integer: ");
					strInput = input.nextLine(); 
					num = Integer.parseInt(strInput); 
				}

			} catch (NumberFormatException nfe){
				if(strInput.equals("quit")) {
					valid = true; 
				} else {
					System.out.println("  '" + strInput + "'" + " is not a positive odd integer");
					System.out.println();
					System.out.print("Enter a positive odd integer: ");
					strInput = input.nextLine(); 
				}
			}
		}
		System.out.println("  Bye!");
		input.close();

	}

}
