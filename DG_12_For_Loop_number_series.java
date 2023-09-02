package com.scaler;

import java.util.Scanner;

public class DG_12_For_Loop_number_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");

        int n = sc.nextInt();

        // syntax : for(initialization; condition; updation) { code block }

        for(int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }
}
