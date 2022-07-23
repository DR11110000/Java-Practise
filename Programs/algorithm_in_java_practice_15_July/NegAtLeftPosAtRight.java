package algorithm_in_java_practice_15_July;

import java.util.Arrays;

public class NegAtLeftPosAtRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-5, -3, 4, 8, -11, 6, -4, 7, 17};
		
		for(int i = 0; i < arr.length; i++) {
			int key = arr[i];
			
			if(key > 0) { continue; }
			
			int j = i - 1;
			
			while(j >= 0 && arr[j] > 0) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
		System.out.print(Arrays.toString(arr));

	}

}

/*
 * Output:
 * {-5, -5, -1, -4, 4, 8, 6, 7, 17}
 * 
 * Time Complexity --> O(N^2) & Space Complexity --> O(1) 
 * */
