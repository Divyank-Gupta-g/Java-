package com.scaler;

import java.util.Scanner;

public class DG_16_02_Array_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Array Elements: ");

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements: ");

        for(int j=0; j<n; j++) {
            System.out.println(arr[j]);
        }
    }
}
