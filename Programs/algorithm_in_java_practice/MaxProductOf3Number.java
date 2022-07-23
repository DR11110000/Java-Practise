package algorithm_in_java_practice;

import java.util.Arrays;

public class MaxProductOf3Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-7, 3, -5, 2, 4};
		
		Arrays.sort(arr);
		for(int i = 0;  i< arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
        int option1 = arr[0] * arr[1] * arr[arr.length - 1];
        int option2 = arr[arr.length - 1] * arr[arr.length - 2] * arr[arr.length - 3];
        System.out.print(Math.max(option1, option2));

	}

}
