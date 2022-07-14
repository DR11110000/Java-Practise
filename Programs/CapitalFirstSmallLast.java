package algorithm_in_java_practice;

import java.util.Arrays;

public class CapitalFirstSmallLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] str = {'i', 'v', 'a', 'R'};
		
		int upperCase = 0, lowerCase = str.length - 1;
		
		while(upperCase < lowerCase) {
			if(str[upperCase] >= 'A' && str[upperCase] <= 'Z') {
				upperCase++;
			}
			
			if(str[lowerCase] >= 'a' && str[lowerCase] <= 'z') {
				lowerCase--;
			}
			
			if((str[upperCase] >= 'a' && str[upperCase] <= 'z') || (str[lowerCase] >= 'A' && str[lowerCase] <= 'Z')) {
				char temp = str[upperCase];
				str[upperCase] = str[lowerCase];
				str[lowerCase] = temp;
				
				upperCase++;
				lowerCase--;
			}
			
		}
		
		System.out.print(Arrays.toString(str));
	}

}
