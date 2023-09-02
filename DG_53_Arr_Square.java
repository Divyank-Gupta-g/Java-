package com.scaler;

import java.util.Scanner;

public class DG_53_Arr_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Array Elements: ");

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        }
    }


