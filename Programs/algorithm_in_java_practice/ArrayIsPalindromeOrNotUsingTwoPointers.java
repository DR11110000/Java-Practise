package algorithm_in_java_practice;

public class ArrayIsPalindromeOrNotUsingTwoPointers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 3, 2, 1};
		
		int startIndex = 0;
		int endIndex = arr.length - 1;
		boolean flag = true; // to track the same value
		while(startIndex <= endIndex) {
			if(arr[startIndex] == arr[endIndex]) {
				startIndex++;
				endIndex--;
			}
			else {
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.print("Is a Palindrome.");
		}
		else {
			System.out.print("Not a Palindrome.");
		}
	}
}
