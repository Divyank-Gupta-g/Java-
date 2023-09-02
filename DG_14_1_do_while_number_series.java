package com.scaler;

import java.util.Scanner;

public class DG_14_1_do_while_number_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n = sc.nextInt();

        int i = 0;

        do {
            System.out.println(i);
            i++;
        } while(i<=n);
    }
}
