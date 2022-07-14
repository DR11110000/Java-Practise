package algorithm_in_java_practice;

import java.util.Arrays;

public class Smallest_positive_missing_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-4, -2};
		int smallest_positive = 1; // smallest positive is 1.
		int pervious_element = 0;
		
		Arrays.sort(arr); // sorting an array
//		System.out.print(Arrays.toString(arr));
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == smallest_positive) {
				pervious_element = smallest_positive;
				smallest_positive++;
				if(i == arr.length - 1) {
					System.out.print(smallest_positive);
					break;
				}
			}
			
			else if(arr[i] == pervious_element) {
				smallest_positive = pervious_element + 1;
				if(i == arr.length - 1) {
					System.out.print(smallest_positive);
					break;
				}
			}
			else {
				System.out.println(smallest_positive);
				break;
			}
		}
		
	}
}
