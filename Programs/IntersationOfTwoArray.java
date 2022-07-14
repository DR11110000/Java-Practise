package algorithm_in_java_practice;

import java.util.Scanner;

public class IntersationOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// array 1 building		
		System.out.println("Enter the size of an array1:: ");
		int arr1_size = sc.nextInt();
		int[] arr1 = new int[arr1_size];
		arr1 = buildArray(arr1, arr1_size);
		
		// array 2 building
		System.out.println("Enter the size of an array2:: ");
		int arr2_size = sc.nextInt();
		int[] arr2 = new int[arr2_size];
		arr2 = buildArray(arr2, arr2_size);
		
		findIntersectionBetweenArrays(arr1, arr2);
	}

	private static void findIntersectionBetweenArrays(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					System.out.print("Common elements in array" + arr1[i] + " ");
				}
			}
		}
		
	}

	private static int[] buildArray(int[] arr, int arr_size) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < arr_size; i++) {
			System.out.println("Enter an elements for an array:: ");
			arr[i] = sc.nextInt();
		}
		return arr;
	}

}
