package algorithm_in_java_practice;

public class FindFirstAndLastOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5, 3, 5, 5, 5, 5, 67, 5, 125};
		int target = 5;
		
		int firstIndex = -1;
		int lastIndex = -1;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == target && firstIndex == -1) {
				firstIndex = i;
			}
			int j = arr.length - 1 - i;
			if(arr[j] == target && lastIndex == -1) {
				lastIndex = j;
			}
		}
		System.out.print(firstIndex);
		System.out.print(lastIndex);

	}

}
