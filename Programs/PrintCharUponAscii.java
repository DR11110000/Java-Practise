package algorithm_in_java_practice;

import java.util.Scanner;

public class PrintCharUponAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ascii:: ");
		int ascii = sc.nextInt();
		
		System.out.print((char)ascii);
	}
}
