package algorithm_in_java_practice_18_July;

public class CheckArrayisSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 11, 7, 9, 15};
		
		boolean isSorted = true;
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] > arr[i+1]) {
				isSorted = false;
				break;
			}
		}
		
		System.out.print(isSorted);;

	}

}
