/*Write a Java program to remove duplicate elements from a given array and return the updated array length.
Sample array: [20, 20, 30, 40, 50, 50, 50]
After removing the duplicate elements the program should return 4 as the new length of the array. */

import java.util.*;

class redundancy{
    public static void main(String[] args){
        int[] a = {20, 20, 30, 40, 50, 50, 50, 60};
        System.out.println("Original array: " + Arrays.toString(a));
        System.out.println("Original array length: " + a.length);

        int index = 1;

        for(int i=0; i<a.length; i++){
            if(a[i]!=a[index-1]){
                a[index++] = a[i];
            }
        }
        System.out.println("New length of array: " + index);
    }
}