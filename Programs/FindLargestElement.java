import java.util.Scanner;

public class FindLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		
		int arr[] = new int[size];
		
		for(int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		
		System.out.print(FindLargest(arr));
	}

	private static int FindLargest(int[] arr) {
		// TODO Auto-generated method stub
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}
