package algorithm_in_java_practice_26_July;

public class ColAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3},{4,5,6}};
		
		int max = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				max = 0;
				if(max < arr[i][j]) {
					max = arr[i][j];
				}
			}
			System.out.println(max);
		}
	}
}
