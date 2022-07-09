import java.io.*;
import java.util.*;

public class Solution {
public static void main(String[] args) {
        // TODO Auto-generated method stub.
    
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        int len = arr.length;
        
        InsetionSort(arr, len-1);

    }

    private static void InsetionSort(int[] arr, int len) {
        // TODO Auto-generated method stub
        int i, j, v;
        for(i = 1; i <= len; i++) {
            v = arr[i]; // 4
            j = i; // 1
            while(j >= 1 && arr[j-1] > v ) { // 9 > 4 && 1 >= 1
                arr[j] = arr[j-1]; //arr[1] = 9  { , 9, 3, 8, 7}
                j--;  //0
            }
            arr[j] = v; // 4 {4, 9, 3, 8, 7}
        }
        
        for(int x = 0; x < arr.length; x++) {
            System.out.print(arr[x] + " ");
        }
        
    }
}
