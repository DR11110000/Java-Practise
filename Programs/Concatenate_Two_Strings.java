/*
Hello + Friends = HelloFriends

Take two strings as input by creating a Scanner object. Print the final string as output after concatenation.

Input Format

Two Lines of input.

The first line of input will contain 1st string.
The second line of input will contain 2nd string.
Constraints

1<=Length_Of_First_String<=100

1<=Length_Of_Second_String<=100

Output Format

Single Line Output

Output will be single concatenated string.

+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Sample Input 0
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

Hello
Friends

+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Sample Output 0
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

HelloFriends
*/
// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//                  Program
// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        System.out.println(a+b);
    }
}
