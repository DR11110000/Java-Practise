package algorithm_in_java_practice;
import java.util.Arrays;

public class ReverseArrayUsingTwoPointers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 1, 7, 8, 5};
		
		int startIndex = 0;
		int endIndex = arr.length - 1;
		
		while(startIndex <= endIndex) {
			int temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
			
			startIndex++;
			endIndex--;
		}
		
		System.out.print(Arrays.toString(arr));

	}

}
