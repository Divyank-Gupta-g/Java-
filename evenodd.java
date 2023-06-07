//Write a Java program to separate even and odd numbers from a given array of integers. Put all even numbers first, and then odd numbers. 

import java.util.*;

class evenodd{
    static void rearrange(int[] a, int n){
        System.out.println("Original array: " + Arrays.toString(a));
        
        int j=0, temp;

        for(int i=0; i<n; i++){
            if(a[i]%2 == 0){
                if(i != j){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                j++;
            }
        }

        System.out.println("Rearranged array: " + Arrays.toString(a));
    }

    public static void main(String[] args){
        int[] a = {2, 5, 7, 6, 8, 10, 100, 1};
        int l = a.length;

        rearrange(a, l);
    }
}