package algorithm_in_java_practice_14_July;

public class FindElementthatappearsonces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7, 3, 5, 4, 5, 3, 4};
		
		int xor = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			xor ^= arr[i];
		}
		
		System.out.print(xor);

	}

}
