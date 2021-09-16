import java.util.Scanner;

public class ArrayLanguageTranslation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an english word: ");
		String wordInput = input.nextLine();
		String[] engWords = { "bird", "bus", "car", "cat", "dog", "school", "thanks", "train", "teacher" };
		String[] finnWords = { "lintu", "bussi", "auto", "kissa", "koira", "koulu", "kiitos", "juna", "opettaja" };

		boolean found = false;
		int index = 0; 
		for (int i = 0; i < engWords.length; i++) {
			if (engWords[i].equals(wordInput)) {
				found = true;
				index = i; 
			} 
		}
		
		if(found == true) {
			System.out.println(finnWords[index]);
		} else {
			System.out.println("Unknown word");
		}
		
		input.close();

	}

}
