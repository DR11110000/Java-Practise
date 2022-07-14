package algorithm_in_java_practice;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 3, 2, 6, 7, 4, 1, 8, 9, 5};
		int len_arr = arr.length;
		
		//sorting using the Insertion Sort
		InsertionSorting(arr, len_arr);

	}

	private static void InsertionSorting(int[] arr, int len_arr) {
		// TODO Auto-generated method stub
		int i, j, val;
		
		for(i = 1; i < len_arr; i++) {
			val = arr[i];
			j = i;
			
			while(j >= 1 && arr[j-1] > val) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = val;
		}
		
		//printing an array
		for(int x = 0; x < len_arr; x++) {
			System.out.print(arr[x] + " ");
		}
	}

}
