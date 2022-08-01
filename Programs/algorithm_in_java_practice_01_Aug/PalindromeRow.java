package algorithm_in_java_practice_01_Aug;

import java.util.Scanner;

public class PalindromeRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		// Building an array
		int[][] matrix = new int[row][col];
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		palindromeRow(matrix, row, col);

	}

	private static void palindromeRow(int[][] matrix, int row, int col) {
		// TODO Auto-generated method stub
		int count = 0;
		
		for(int i = 0; i < row; i++) {
			boolean palidromeicRow = true; // to check if the row is palindromeic row
			int j = 0;  // startIndex
			int k = col-1;  // EndIndex
			
			// To check if the given row is palindromic array using 2-pointer approach
			while(j < k) {
				if(matrix[i][j] != matrix[i][k]) {
					palidromeicRow = false; 
					break;
				}
				j++;
				k--;
			}
			// if the palindrom then increment the count by 1
			if(palidromeicRow) {
				count ++;
			}
		}
		System.out.println(count);		
	}

}

/*
 * Time Complexity --> O(N/2)
 * Space Complexity --> O(1)
 * */
