//*###*
//#%%%#
//#%%%#
//#%%%#
//*###*



public class PatternProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i <= 5; i++) {
			for(int j = 0; j <= 4; j++) {
				if((i == 0 && j == 0)||(i == 0 && j ==4)||(i == 5 && j == 0)||(i == 5 && j == 4)) {
					System.out.print("* ");
				}
				else if(i == 0 && (j != 0 && j != 4)||(i == 5 && (j != 0 && j != 4))) {
					System.out.print("# ");
				}
				else if(((i == 1 || i == 2 || i == 3 || i == 4) && j == 0)||((i == 1 || i == 2 || i == 3 || i == 4) && j == 4)) {
					System.out.print("# ");
				}
				else {
					System.out.print("% ");
				}
			}
			System.out.println();
		}

	}

}
