import java.util.Scanner;

/*
 * 
 * 1 4 7
 * 2 5 8
 * 3 6 9
 * 
 * condition --> if row --> x ++
 * condition --> if col --> x += 3
 * 
 */


public class Patter1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
				
		int x = s.nextInt() ;
		
		int rowCounter = 0;
		for(int i = 0; i < x; i ++) {
			rowCounter++;  // 1 2
			int colCounter = rowCounter; // 1 2 3
			for(int j = 0; j < x; j++) {
				System.out.print(colCounter + " "); //[1 4 7] [2 5 8] [3 6 9]
				colCounter += x; // 1+3 = 4 + 3 = 7// 2 + 3 = 5
			}
			System.out.println();
		}

	}

}
