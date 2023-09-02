package com.scaler;

import java.util.Scanner;
public class DG_12_1_For_Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of integers you want to enter: ");
        int n = sc.nextInt();

        System.out.println("Enter numbers:");

        int max = Integer.MIN_VALUE;        // takes minimum possible integer value.

        for(int i=1; i<=n; i++) {
            int num = sc.nextInt();
            max = Math.max(max, num);
        }

        System.out.print("Maximum value: ");
        System.out.println(max);
    }
}
