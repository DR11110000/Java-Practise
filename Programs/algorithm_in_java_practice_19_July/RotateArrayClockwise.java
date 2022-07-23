package algorithm_in_java_practice_19_July;

import java.util.Arrays;

public class RotateArrayClockwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		
		int rotate = 2;
		while(rotate > 0) {
			for(int i = arr.length-1; i > 0; i--) {
				int temp = arr[i - 1];
				arr[i - 1] = arr[i];
				arr[i] = temp;
			}
			rotate--;
		}
		System.out.print(Arrays.toString(arr));
	}

}
