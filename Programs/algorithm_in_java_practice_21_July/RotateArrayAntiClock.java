package algorithm_in_java_practice_21_July;

import java.util.Arrays;

public class RotateArrayAntiClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8};
		int t = arr[0];
		for(int i = 1; i< arr.length; i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length-1] = t;
		System.out.print(Arrays.toString(arr));
	}

}
