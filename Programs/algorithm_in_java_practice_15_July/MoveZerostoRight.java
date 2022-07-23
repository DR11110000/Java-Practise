package algorithm_in_java_practice_15_July;

import java.util.Arrays;

public class MoveZerostoRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4, 5, 0, 5, 3, 0, 5, 7, 0, 9};
		
		int index = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				arr[index] = arr[i];
				index ++;
			}
		}
		
		while(index <= arr.length - 1) {
			arr[index] = 0;
			index++;
		}
		
		System.out.print(Arrays.toString(arr));

	}

}
