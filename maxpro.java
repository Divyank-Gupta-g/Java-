//Write a Java program to find the maximum product of two integers in a given array of integers.

import java.util.*;

class maxpro{
    public static void main(String[] args){
        int[] a = {2, 3, 5, 7, -7, 5, 8, -5};
        int l = a.length;
        System.out.println("Original array: " + Arrays.toString(a));
        int pro = 0;
        int max_i = 0;
        int max_j = 0;

        for(int i=0; i<l; i++){
            for(int j=i+1; j<l; j++){
                if(a[i]*a[j]>pro){
                    pro = a[i]*a[j];
                    max_i = i;
                    max_j = j;
                }
            }
        }

        System.out.println("Maximum Product: " + pro);
        System.out.println("Pair: " + a[max_i] + ", " + a[max_j]);
    }
}