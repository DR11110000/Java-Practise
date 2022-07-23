package algorithm_in_java_practice_14_July;

public class findPeak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 3, 2, 4, 3};
		
		for(int i = 1; i < arr.length - 1; i++) {
			if((arr[i-1] < arr[i]) && (arr[i] > arr[i+1])) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
