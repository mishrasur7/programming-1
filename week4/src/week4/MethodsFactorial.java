package week4;



public class MethodsFactorial {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			System.out.println(i + "! = " + factorial(i));
		}


	}

	private static int factorial(int num) {
		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}
		return factorial;
	}

}
