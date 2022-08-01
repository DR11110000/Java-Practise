package algorithm_in_java_practice_28_July;

public class swapRows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{3,0,7}};
		int r1 = 1;
		int r2 = 3;
		for(int i = 0; i < arr[0].length; i++) {
			int temp = arr[r1][i];
			arr[r1][i] = arr[r2][i];
			arr[r2][i] = temp;
		}

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+" 	");
			}
			System.out.println();
		}
	}

}
