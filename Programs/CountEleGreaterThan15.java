
public class CountEleGreaterThan15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30, 40, 50};
		int c = 0, num = 15;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > 15) {
				c++;
			}
		}
		System.out.print(c);
		
	}

}
