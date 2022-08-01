
public class Count_Even_Pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		int counter = 0;
		for(int i = 1; i <= x; i++) {
			for(int j = i+1; j <= x; j++) {
				if((i+j)%2 == 0) {
					counter++;
					System.out.println(i+" "+ j);
				}
			}
		}
		System.out.println(counter);

	}

}
