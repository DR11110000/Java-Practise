package algorithm_in_java_practice;

public class SearchElementIn2D {
	public static void main(String[] args) {
	int[][] arr = {{1, 2, 3, 4}, {5, 6, 4, 9}, {7, 5, 6, 2}};
	int target = 9;
	boolean flag = false;
	for(int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[i][j]);
			if(arr[i][j] == target) {
				flag = true;
				}
			}
		}
	if(flag) {
		System.out.print("Yes");
	}
	else {
		System.out.print("No");
	}
	}
}
