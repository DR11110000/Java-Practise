package algorithm_in_java_practice_28_July;

public class SymmetricMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{2,3,6},{3,4,5},{6,5,9}};
		
		int[][] narr = new int[arr.length][arr[0].length];
		
		for(int i = 0; i < arr[0].length; i++) {
			for(int j = 0; j < arr.length; j++) {
				narr[i][j] = arr[j][i];
			}
		}
		
		int m = arr.length;
		int n = arr[0].length;
		
		boolean isSymmetric = true;
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(arr[i][j] != narr[i][j]) {
					isSymmetric = false;
				}
			}
		}
		
		System.out.println(isSymmetric);

	}

}
