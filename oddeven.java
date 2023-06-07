//Write a Java program to find the number of even and odd integers in a given array of integers.

import java.util.*;

class oddeven{
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int even = 0;
        int odd = 0;

        for(int n : arr){
            if(n%2==0){ even++; }
            else{ odd++; }
        }

        System.out.println("Number of even elements: " + even);
        System.out.println("Number of odd elements: " + odd);
    }
}