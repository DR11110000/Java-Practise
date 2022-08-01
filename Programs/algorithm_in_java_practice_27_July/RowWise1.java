package algorithm_in_java_practice_27_July;

public class RowWise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,1,3,7},{4,5,2,9}};
		
		for(int i = 0; i < arr.length; i++) {
			if(i%2 == 0) {
				for(int j = 0; j < arr[0].length; j++) {
					System.out.print(arr[i][j]+" ");
				}
			}
			else {
				for(int j = arr[0].length - 1; j >= 0; j--) {
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}

	}

}
