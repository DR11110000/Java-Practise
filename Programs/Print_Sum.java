/*
In this challenge, you have to read two integer value from stdin, then print the sum of these according to the instructions in the Output Format section below. You need to create a Scanner object and then take in the inputs

Input Format

There are three lines of input:

The first line contains an integer.
The second line contains again contains an integer.
Constraints

-

Output Format

There is one line of output:

The Sum of the two integers

+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Sample Input 0
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
1
2    
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Sample Output 0
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
3

Explanation 0

Sum of 1 + 2 is 3
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Sample Input 1
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
10
2
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Sample Output 1
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
12
Explanation 1

Sum of 10 and 2 is 12
*/

// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//                  Program
// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(a+b);
    }
}
