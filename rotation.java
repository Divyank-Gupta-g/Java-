//Write a Java program to find the rotation count in a given rotated sorted array of integers. 

import java.util.*;

class rotation{
    static int count(int[] a, int n){
        System.out.println("Original array: " + Arrays.toString(a));

        int min = a[0], index = 0;
        for(int i=0; i<n; i++){
            if(min > a[i]){
                min = a[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args){
        int a[] = {7, 9, 11, 12, 5};
        int n = a.length;

        System.out.println("NO. OF ROTATIONS: " + count(a,n));
    }
}