package algorithm_in_java_practice_16_July;

public class FindLeader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 16, 18, 17, 4, 3, 5, 2 };
        int max = a[a.length - 1];
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - 1 - i];
            if (b[i] >= max) {
                max = b[i];
                System.out.println(max);
            }
        }	
	}
}
