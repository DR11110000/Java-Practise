package algorithm_in_java_practice;

import java.util.Arrays;

public class MovingZeroesUsingTwoPointers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 0, 1, 1, 0, 1, 0};
		
		int startIndex = 0;
		int endIndex = arr.length - 1;
		
		while(startIndex < endIndex) {
			
			// to track the 0 from start of an array
			if(arr[startIndex] == 1) {
				startIndex++;
			}
			
			// to track the 1 from end of an array
			if(arr[endIndex] == 0) {
				endIndex--;
			}
			
			// Swamping 
			if(arr[startIndex] != 1 && arr[endIndex] != 0) {
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
