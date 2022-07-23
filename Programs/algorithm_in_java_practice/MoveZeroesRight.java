package algorithm_in_java_practice;

public class MoveZeroesRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0, 2, 0, 1, 4, 3};
		int index = 0; //count the zero and index of an array
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				arr[index] = arr[i];
				index++;
			}
		}
		
		while(index < arr.length) {
			arr[index] = 0;
			index++;
		}
		
		for(int a = 0; a < arr.length; a++) {
			System.out.print(arr[a]+" ");
		}

	}

}
