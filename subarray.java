//Write a Java program to print all sub-arrays with 0 sum present in a given array of integers.  

import java.util.*;

class subarray{
    static void sub(int[] a){
        System.out.println("Original array: " + Arrays.toString(a));

        List<Integer> l = new ArrayList<Integer>();

        for(int i=0; i<a.length; i++){
            int s = 0;
            l.removeAll(l);
            for(int j=i; j<a.length; j++){
                s += a[j];
                l.add(a[j]);

                if(s==0){
                    System.out.println("Subarray with sum 0: " + l.toString());
                }
            }
        }
    }

    public static void main(String[] args){
        int[] a = {1, 2, -3, 2, -4, 3, 6, -5, -9};

        sub(a);
    }
}