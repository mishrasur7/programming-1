import java.util.Random;

public class ArrayLottoNumbers {

	public static void main(String[] args) {
		Random randomNum = new Random();

		int x;

		for (int i = 1; i <= 7; i++) {
			x = 1 + randomNum.nextInt(39);
			System.out.print(x + " ");
		}

	}

}
