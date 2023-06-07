//Write a Java program to check if the sum of all the 10's in the array is exactly 30. Return false if the condition does not satisfy, otherwise true.

import java.util.*;

class tensum{
    static boolean sums(int[] a){
        int sum = 0;

        for(int i=0; i<a.length; i++){
            if(a[i]==10){ sum += a[i]; }
        }
        
        if(sum==30){ return true; }
        else {return false; }
    }

    public static void main(String[] args){
        int[] a = {1, 0, 2, 20, 10, 30, 10, 40, 10};
        int[] b = {10, 2, 10, 4, 10, 5, 3, 10};
        System.out.println(sums(a));
        System.out.println(sums(b));
    }
}