package algorithm_in_java_practice;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 9};
		int n = arr.length + 1; // length of an total array + 1
		int totalSum = n*(n+1)/2; // Arithmetic formula for 1+2+3+4...n(n+1)/2
		int startIndex = 0; // starting index of an array
		int endIndex = arr.length - 1; // end index of an array
		int sum = 0; // sum of the array
		while(startIndex < endIndex) {
			
			sum += arr[startIndex] + arr[endIndex];
			
			startIndex++;
			endIndex--;
		}
		System.out.print(totalSum - sum);
	}

}
