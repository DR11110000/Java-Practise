package algorithm_in_java_practice_25_July;

public class ColWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3,6},{4,5,6,7},{7,8,9,3},{4,9,5,1}};
		
		for(int i = 0; i < arr.length; i++) {
			if(i%2 == 0) {
				for(int j = 0; j < arr[0].length; j++) {
					System.out.print(arr[j][i]);
				}
			}
			else {
				for(int j = arr[0].length - 1; j >= 0; j--) {
					System.out.print(arr[j][i]);
				}
			}
			System.out.println();
		}
	}

}
