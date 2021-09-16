import java.util.Scanner;

public class StringRemoveSpace {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter a string: ");
		String strInput = input.nextLine(); 
		String newString = removeExtraSpace(strInput); 
		System.out.println("\"" + newString + "\"");
		input.close();
	}
	
	public static String removeExtraSpace(String string) {
		String newString = string.trim().replaceAll("\\s+", " "); 
		return newString; 
	}

}
