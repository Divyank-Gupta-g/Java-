package com.scaler;

import java.util.Scanner;

public class DG_13_2_WHILE_Count_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer number: ");
        int n = sc.nextInt();

        int c = 0;

        while(n > 0) {
            n = (n/10);
            c++;
        }

        System.out.print("The number of digits: ");
        System.out.println(c);
    }
}
