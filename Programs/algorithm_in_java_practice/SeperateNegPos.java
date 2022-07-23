package algorithm_in_java_practice;

public class SeperateNegPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {-5, -3, 4, 8, -11, 6, -4, 5, 17, 7};
		
		// solving using the insertion sort
		int key, i, j;
		for(i = 0; i < arr.length; i++) {
			key = arr[i];
			
			j = i - 1;
			
			if(key > 0) { continue; }
			
			while(j >= 0 && arr[j] > 0) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
		for(int k = 0; k < arr.length; k++) {
			System.out.print(arr[k]+" ");
		}
	}

}
