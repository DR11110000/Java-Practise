package algorithm_in_java_practice;

import java.util.Arrays;

public class MoveZerors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 0, 1, 1, 0, 1, 0};
		
		int index = arr.length - 1;; // track the index of the array 
		
		for(int i = arr.length - 1; i >= 0; i--) {
			if(arr[i] != 0) {
				arr[index] = arr[i];
				index--;
			}
		}
		
		// adding zeroes at start of an array
		while(index >= 0) {
			arr[index] = 0;
			index --;
		}
		
		System.out.print(Arrays.toString(arr));

	}

}

// Time complexity
//  O(N) + O(N) --> O(2N) --> 2 is constrain we can remove ==> O(N)
