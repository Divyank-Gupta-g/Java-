//Write a Java program to find a missing number in an array.(Hashing apprach)

import java.util.*;

class missing{
    static void miss_ele(int[] a, int n){
        int[] temp = new int[n+1];

        for(int i=0; i<n+1; i++){
            temp[i] = 0;
        }

        for(int i=0; i<n; i++){
            temp[a[i]-1] = 1;
        }

        for(int i=0; i<n; i++){
            if(temp[i] == 0){
                System.out.println("Missing num: " + (i+1));
            }
        }
    }
    
    public static void main(String[] args){
        int[] a = {1, 2, 3, 4, 6, 7};
        int n = a.length;

        miss_ele(a, n);
    }
}