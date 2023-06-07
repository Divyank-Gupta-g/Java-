// Write a Java program to remove duplicate elements from an array.

import java.util.*;

class duplicateremove{
    static void unique(int[] a){
        System.out.println("Original array: " + Arrays.toString(a));

        int l = a.length;

        for(int i=0; i<l; i++){
            for(int j=i+1; j<l; j++){
                if(a[i]==a[j]){
                    a[j]=a[l-1];
                    l--;
                    j--;
                 }
            }
        }

        int[] a1 = Arrays.copyOf(a, l);
        System.out.println("Arrays with unique elements: " + Arrays.toString(a1));
    }
    
    public static void main(String[] args){
        unique(new int[] {2, 4, 6, 8, 2});
        unique(new int[] {1, 3, 5, 7, 1});
    }
}