//Write a Java program to arrange the elements of an array of integers so that all positive integers appear before all negative integers.  

import java.util.*;

class pos{
    static void rearrange(int[] a, int n){
        int j=0, temp;

        for(int i=0; i<n; i++){
            if(a[i]>=0){
                if(i != j){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                j++;
            }
        }
    }

    static void printarr(int[] a, int n){
        System.out.println("Rearranged array: " + Arrays.toString(a));
    }

    public static void main(String[] args){
        int[] a = {0, 2, -2, 0, -1, 4, 5, -8};
        int l = a.length;
        System.out.println("Original array: " + Arrays.toString(a));

        rearrange(a, l);
        printarr(a, l);
    }
}