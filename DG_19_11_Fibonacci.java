package com.scaler;

import java.util.*;

public class DG_19_11_Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci series: ");
        fib(n);
    }

    static void fib(int x){
        int[] a = new int[x];

        for(int i=0; i<x; i++){
            if(i==0 || i==1)
                a[i] = i;
            else
                a[i] = a[i-1] + a[i-2];
        }

        for(int i=0; i<x; i++){
            System.out.print(a[i] + ", ");
        }
    }
}
