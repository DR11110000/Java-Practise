package algorithm_in_java_practice;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1};
		
		for(int i = 0; i < arr.length; i++) {
			int min = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
