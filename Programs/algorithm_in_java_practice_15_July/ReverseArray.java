package algorithm_in_java_practice_15_July;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4};
		int size = 0;
		int rev_arr[] = new int[arr.length];
		
		for(int i = arr.length - 1; i >= 0 ; i--) {
			rev_arr[size] = arr[i];
			size++;
		}
		
		System.out.print(Arrays.toString(rev_arr));

	}

}
