package algorithm_in_java_practice_18_July;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 4, 6, 8, 1, 3, 5, 7, 9};
		
		for(int i = 0;  i < arr.length; i++) {
			boolean swapped = false;
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
				System.out.println("Pass:: " + Arrays.toString(arr));
			}
			
			if(swapped == false) {
				break;
			}
		}
		System.out.print(Arrays.toString(arr));
	}
}
