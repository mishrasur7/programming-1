import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String strInput1 = input.nextLine();
		System.out.print("Enter second string: ");
		String strInput2 = input.nextLine();
		String check = isAnagram(strInput1, strInput2);
		System.out.println(check);
		input.close();
	}

	public static String isAnagram(String string1, String string2) {
		string1 = string1.replaceAll("[\\s,\\.]", "").toLowerCase();
		string2 = string2.replaceAll("[\\s,\\.]", "").toLowerCase();
		String check = "";

		if ((string1.matches("[a-zåöäA-ZÅÖÄ]{1,}")) && (string2.matches("[a-zåöäA-ZÅÖÄ]{1,}"))) {
			string1 = string1.replaceAll("[\\s,\\.]", "").toLowerCase();
			string2 = string2.replaceAll("[\\s,\\.]", "").toLowerCase();
			char[] char1 = string1.toCharArray();
			char[] char2 = string2.toCharArray();
			Arrays.sort(char1);
			Arrays.sort(char2);
			String newString1 = Arrays.toString(char1);
			String newString2 = Arrays.toString(char2);
			if(newString1.equals(newString2)) {
				check += "Anagram!"; 
			}

		} else {
			check += "No anagram.";
		}

		return check;

	}

}
