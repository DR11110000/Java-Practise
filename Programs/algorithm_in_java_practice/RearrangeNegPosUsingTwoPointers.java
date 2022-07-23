package algorithm_in_java_practice;

import java.util.Arrays;

public class RearrangeNegPosUsingTwoPointers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-5, -3, 4, 8, -11, 6, -4, 5, 17, 7};
		
		int startIndex = 0; // to track the index of an array from start
		int endIndex = arr.length - 1; // to track the index of an array from end
		
		while(startIndex < endIndex) {
			
			// to check that the value is less than zero
			if(arr[startIndex] < 0) {
				startIndex++;
			}
			
			// to check that the value is greater than zero
			if(arr[endIndex] > 0) {
				endIndex--;
			}
			
			// Swapping
			if(arr[startIndex] > 0 && arr[endIndex] < 0) {
				int temp = arr[startIndex];
				arr[startIndex] = arr[endIndex];
				arr[endIndex] = temp;
				
				startIndex++;
				endIndex--;
			}	
		}
		System.out.print(Arrays.toString(arr));
	}

}

/*
 * Time Complexity
 * O(N/2) --> there is one loop
 * */
