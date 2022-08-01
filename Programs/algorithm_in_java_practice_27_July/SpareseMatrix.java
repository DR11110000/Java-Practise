package algorithm_in_java_practice_27_July;

public class SpareseMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] Matrix = {{0,0,3,0,4},{0,0,5,7,0},{0,0,0,0,0},{0,2,6,0,0}};
		
		System.out.print(isSparseMatrix(Matrix));

	}

	private static boolean isSparseMatrix(int[][] matrix) {
		// TODO Auto-generated method stub
		
		int non_zeroes = 0;
		int condition = (matrix.length*matrix[0].length)/2;
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				if(matrix[i][j] != 0) {
					non_zeroes++;
				}
			}
		}
		
		if(non_zeroes < condition) {
			return true;
		}
		else {
			return false;
		}
		
	}
}