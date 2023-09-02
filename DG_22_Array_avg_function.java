package com.scaler;

import java.util.Scanner;

public class DG_22_Array_avg_function {

    static float avg() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int s = 0;

        for(int i=0; i<n; i++) {
            s = s + arr[i];
        }

        System.out.println("Sum of all elements of list: " + s);

        float av = (float)s/n;
        System.out.print("Average of list: " + av);
        return av;

    }

    public static void main(String[] args) {
        avg();
    }
}
