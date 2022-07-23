package algorithm_in_java_practice_21_July;

import java.util.Arrays;
import java.util.Scanner;

public class Compare2DMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] mat = new int[row][col];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++){
				mat[i][j] = sc.nextInt();
			}
		}
		
		int row2 = sc.nextInt();
		int col2 = sc.nextInt();
		int[][] mat1 = new int[row2][col2];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++){
				mat1[i][j] = sc.nextInt();
			}
		}
		boolean check = Arrays.deepEquals(mat, mat1);
		if(check) {
			System.out.print("Yes");
		}
		else {
			System.out.print("No");
		}

	}

}
