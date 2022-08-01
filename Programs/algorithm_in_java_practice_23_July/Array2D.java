package algorithm_in_java_practice_23_July;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size:: ");
		int row = sc.nextInt();
		System.out.println("Enter the col size:: ");
		int col = sc.nextInt();
		
		// Building first array
		char[][] arr1 = new char[row][col];
		char ch = 'A';
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				arr1[i][j] = ch;
				ch++;
			}
		}
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1.length; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	}

}
