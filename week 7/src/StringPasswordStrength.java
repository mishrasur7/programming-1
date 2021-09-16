import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPasswordStrength {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter password: ");
		String strInput = input.nextLine();
		boolean valid = checkStrength(strInput);
		if (valid == true) {
			System.out.println("OK");
		} else {
			System.out.println("Not strong enough!");
		}
		input.close();

	}

	public static boolean checkStrength(String password) {
		String regex = "((?=.*[A-Z_])(?=.*[a-z])(?=.*[0-9]).{8,})|"
						+ "(?=.*[A-Z])(?=.*[0-9_])(?=.*[^\\w]).{8,}|"
						+ "(?=.*[a-z_])(?=.*[0-9])(?=.*[^\\w]).{8,}|"
						+ "(?=.*[a-z])(?=.*[A-Z])(?=.*[^\\W]).{8,}"; 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}

}
