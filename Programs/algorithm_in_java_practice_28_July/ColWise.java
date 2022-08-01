package algorithm_in_java_practice_28_July;

public class ColWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3,6},{4,5,6,7},{7,8,9,3},{4,9,5,1}};
		
		int r = arr.length;
		int c = arr[0].length;
		
		for(int i = 0; i < c; i++) {
			if(i%2 == 0) {
				for(int j = 0; j < r; j++){
					System.out.print(arr[j][i]);
				}
			}
			else {
				for(int j = r-1; j >= 0; j--) {
					System.out.print(arr[j][i]);
				}
			}
			System.out.println();
		}

	}

}
