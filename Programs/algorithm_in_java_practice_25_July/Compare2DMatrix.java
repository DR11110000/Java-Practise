package algorithm_in_java_practice_25_July;

public class Compare2DMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr1 = {{1,2,3}, {4,5,6}, {7,8,9}};
		int[][] arr2 = {{1,2,3}, {4,5,6}};
		
		int row1 = 3;
		int col1 = 3;
		
		int row2 = 2;
		int col2 = 3;
		boolean isSame = true;
		
		if(row1 == row2 && col1 == col2) {
		
			for(int i = 0; i < row1; i++) {
				for(int j = 0; j < col1; j++) {
					if(arr1[i][j] != arr2[i][j]) {
						isSame = false;
					}
				}
			}
		}
		else {
			isSame = false;
		}
		if(isSame) {
			System.out.println("Same");
		}
		else {
			System.out.println("Not Same");
		}
	}

}
