import java.util.Scanner;

public class checkNumberIsPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		int key = sc.nextInt();
		System.out.print(checkNumber(arr, key));
	}

	private static boolean checkNumber(int[] arr, int key) {
		// TODO Auto-generated method stub
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == key) {
				return true;
			}
		}
		return false;
	}

}
