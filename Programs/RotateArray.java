package algorithm_in_java_practice;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		int rotateBy = 3;
		
		int i = 0, j = 0, key;
		
		while(rotateBy > 0) {
			key = arr.length - 1;
			
			for(j = 0; j < arr.length; j++) {
				int temp = arr[j];
				arr[i] = key;
				arr[i+1] = temp;
			}
			rotateBy --;
		}
		
		System.out.print(Arrays.toString(arr));

	}

}
