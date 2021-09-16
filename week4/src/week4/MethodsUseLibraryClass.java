package week4;

import java.util.Scanner;

public class MethodsUseLibraryClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter an integer: ");
		int num = input.nextInt(); 
		int factorial = MethodsLibrary.factorial(num);
		System.out.println(num + "! = " + factorial);
		input.close();
	}

}
