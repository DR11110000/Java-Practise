package algorithm_in_java_practice_01_Aug;

import java.util.Arrays;
import java.util.Scanner;

public class SortMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		// Building a Matrix
		int[][] matrix = new int[row][col];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		sortMatrix(matrix, row, col);
	}

	private static void sortMatrix(int[][] matrix, int row, int col) {
		// TODO Auto-generated method stub
		int p = 0; // to keep track the index of the temp matrix
		int[] temp = new int[row*col]; // creating temp with 1D array
		int k = 0; // to keep track of the index 
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				temp[k] = matrix[i][j];
				k++;
			}
		}
		
		Arrays.sort(temp);  // Sorting an array
		
		// Loop to print the data from the temp Matrix		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print(temp[p]+ " ");
				p++;
			}
			System.out.println();
		}
	}
}
