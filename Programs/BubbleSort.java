package algorithm_in_java_practice;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 3, 2, 6, 7, 4, 1, 8, 9, 5};
		int len_arr = arr.length;
		
		//sorting an array using Bubble sorting
		BubbleSorting(arr, len_arr);
	}

	private static void BubbleSorting(int[] arr, int len_arr) {
		// TODO Auto-generated method stub
		int i, j, swap, temp = 0;
		for(i = len_arr - 1; i >= 0; i--) {
			swap = 0;
			for(j = 0; j < arr.length-1; j++) {
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap = 1;
				}
			}
			if (swap == 0) {
				break;
			}
		}
		
		//Printing an array
		for(int x = 0; x < arr.length; x++) {
			System.out.print(arr[x]+" ");
		}
		
	}

}
