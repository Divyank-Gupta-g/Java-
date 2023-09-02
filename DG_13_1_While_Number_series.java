package com.scaler;

import java.util.Scanner;

public class DG_13_1_While_Number_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n = sc.nextInt();

        int i = 0;

        while (i<=n) {
            System.out.println(i);
            i++;
        }
    }
}
