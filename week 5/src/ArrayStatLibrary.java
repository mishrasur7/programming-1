
import java.util.Arrays;

public class ArrayStatLibrary {

	public static int max(int[] a) {
		int maxSoFar = a[0];
		for (int i = 0; i < a.length; i++) {
			if (maxSoFar < a[i]) {
				maxSoFar = a[i];
			}
		}
		return maxSoFar;
	}

	public static int min(int[] a) {
		int minSoFar = a[0];
		for (int i = 0; i < a.length; i++) {
			if (minSoFar > a[i]) {
				minSoFar = a[i];
			}
		}
		return minSoFar;
	}

	public static double median(int[] a) {
		Arrays.sort(a);
		int totalElements = a.length;
		double median; 
		if(totalElements % 2 == 1) {
			median = a[(totalElements + 1)/2 -1]; 
		} else {
			median = (a[totalElements/2 - 1] + a[totalElements/2])/2; 
		}
		return median;
	}
	
	public static double mean(int[] a) {
		double sum = 0; 
		for(int i = 0; i < a.length; i++) {
			sum += a[i]; 
		}
		double mean = sum/a.length; 
		return mean; 
	}
	
	public static double standardDeviation(int[] a) {
		double sampleMean = mean(a); 
		
		double compute = 0; 
		for(int i = 0; i < a.length; i++) {
			compute += Math.pow((a[i] - sampleMean), 2); 
		}
		
		double nextCompute = compute/(a.length - 1); 
		double standardDeviation = Math.sqrt(nextCompute); 
		
		return standardDeviation; 
	}

}
