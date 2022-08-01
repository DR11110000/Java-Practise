package algorithm_in_java_practice_26_July;

public class RowminVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3},{4,5,6}};
		
		int min = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				min = arr[i][0];
				if(min > arr[i][j]) {
					min = arr[i][j];
				}
			}
			System.out.println(min);
		}
	}

}
