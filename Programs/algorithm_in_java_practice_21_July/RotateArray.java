package algorithm_in_java_practice_21_July;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8};
		int t = 3;
		while(t > 0) {
			int temp = arr[arr.length-1];
			for(int i = arr.length - 1; i > 0; i--) {
				arr[i] = arr[i-1];
			}
			arr[0] = temp;
			t--;
		
		}
		System.out.print(Arrays.toString(arr));
	}

}
