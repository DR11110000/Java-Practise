package algorithm_in_java_practice_18_July;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int startIndex = 0;
		int endIndex = arr.length - 1;
		
		while(startIndex < endIndex) {
			int temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
			
			startIndex++;
			endIndex--;
		}	
		System.out.print(Arrays.toString(arr));
	}
}
