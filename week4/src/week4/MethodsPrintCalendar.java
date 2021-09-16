package week4;

import java.time.LocalDate;
import java.util.Scanner;

public class MethodsPrintCalendar {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter year: ");
		int year = input.nextInt();
		System.out.print("Enter month: ");
		int month = input.nextInt(); 

	}
	
	private static int printCalendar(int year, int month) {
		LocalDate myDate = LocalDate.of(2021, 7, 24); 
		int daysInMonth = myDate.lengthOfMonth(); 
		int dayOfWeek = myDate.getDayOfweek()
		
		return 0; 
	}

}
