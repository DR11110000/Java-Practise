
public class RPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 4;
		
		for(int i = 0; i <= x; i++) {
			for(int j = 0; j <= x; j ++) {
				if((i == 0 && j == 0)|| (j == 0)|| (j == 1 && i == 0) || (i == 2 && j == 1)|| (i == 1 && j ==2)||(i ==  3 && j == 1) ||(i ==4 && j == 2)){
					System.out.print("R");
				}
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}