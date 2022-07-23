package algorithm_in_java_practice;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9, 4, 3, 8, 7};
		int len = arr.length;
		
		selecttionSort(arr, len);

	}

	private static void selecttionSort(int[] arr, int len) {
		// TODO Auto-generated method stub
		for(int i = 0; i < len; i++) {
			int min = i;
			for(int j = i+1; j < len; j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		
		for(int a = 0; a < len; a++) {
			System.out.print(arr[a] + " ");
		}
	}

}
