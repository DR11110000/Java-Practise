package algorithm_in_java_practice_15_July;

import java.util.Arrays;

public class RotateArrayRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		int shift = 3; // times to rotate an array
		int len = arr.length; // length of an array
		int p = 1;
		
		while(p <= shift) {
			int first = arr[len-1];
			for(int i = len - 2; i >= 0; i --) {
				arr[i+1] = arr[i];
			}
			arr[0] = first;
			p++;
		}
		System.out.print(Arrays.toString(arr));	

	}

}
