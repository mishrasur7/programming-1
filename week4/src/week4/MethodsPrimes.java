package week4;

import java.util.Scanner;

public class MethodsPrimes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many primes: ");
		int numInput = input.nextInt();
		
		int count = 1; 
		int startNumber = 1; 
		while(count <= numInput) {
			startNumber++; 
			if(isPrime(startNumber) == true) {
				System.out.print(startNumber + " ");
				count++; 
			}
		}
		
	
	}

	private static boolean isPrime(int num) {
		boolean flag = true;
		if (num > 1) {
			for (int i = 2; i < num; i++) {
				if ((num % i) == 0) {
					flag = false;
				}
			}
		} else {
			flag = false;
		}

		return flag;

	}

}
