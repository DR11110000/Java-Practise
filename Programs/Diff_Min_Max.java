package algorithm_in_java_practice;

import java.util.Arrays;

public class Diff_Min_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10, 2, 3, 4, 9};
		
		Arrays.sort(arr);
		
//		System.out.print(Arrays.toString(arr));
		int difference = arr[arr.length - 1] - arr[0];
		
		System.out.print(difference);
		
	}

}
