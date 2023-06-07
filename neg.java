//Write a Java program to arrange the elements of an array of integers so that all negative integers appear before all positive integers. 

import java.util.*;

class neg{
    static void rearrange(int[] a, int n){
        int j=0, temp;

        for(int i=0; i<n; i++){
            if(a[i]<0){
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
        for(int ele : a){
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args){
        int[] a = {2, -1, 4, 6, 8, -3, 0, -1, -2};
        int l = a.length;     
        System.out.println("Original Array: " + Arrays.toString(a));

        rearrange(a, l);
        printarr(a, l);
    }
}