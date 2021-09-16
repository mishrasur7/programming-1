package week4;

public class MethodsLibrary {
	public static int factorial(int num) {
		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}
		return factorial; 
	}

}
