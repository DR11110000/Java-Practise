package algorithm_in_java_practice;

public class pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 7;
		int s = num/2;
		for(int i = 1; i <= num-s; i++) {
			
			for(int j = num - s; j >= i; j--) {
				System.out.print("*");
			}
			for(int k = 1; k <= 2*i-1; k++) {
				System.out.print(" ");
			}
			for(int j = num - s; j >= i; j--) {
				System.out.print("*");
			}			
			System.out.println();
		}
		
		for(int i = 1; i <= s; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for(int k = 2*(s-i); k >= 0 ; k--) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}

}
