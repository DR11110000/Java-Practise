import java.util.Scanner;

public class ReversePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		for(int i = 0; i < x; i++) {	// O(N)	// 0 1 2 3 4 	
			for(int j = x; j >= 0; j--) { //O(N) o(n) * O(n) == o(n^2) || O(n) * ( o(n)) == O(n) = o(n) / 0 -> 0 1 2 3 4 , 1 -> 0,1,2,3,4
				if(j <= i) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
