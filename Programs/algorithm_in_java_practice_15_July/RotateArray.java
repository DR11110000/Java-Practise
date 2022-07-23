package algorithm_in_java_practice_15_July;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		int shift = 3; // times to rotate an array
		int len = arr.length; // length of an array
		int p = 1;
		while(p <= shift) {
			int last = arr[0];
			for(int i = 0;  i < len - 1; i++) {
				arr[i] = arr[i+1];
			}
			arr[len - 1] = last;
			p++;
		
		}
		System.out.print(Arrays.toString(arr));
	}

}
