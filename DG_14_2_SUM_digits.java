package com.scaler;

import java.util.Scanner;

public class DG_14_2_SUM_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer number: ");
        int n = sc.nextInt();

        int s = 0;

        do{
            int d = n%10;
            s = s+d;
            n = n/10;
        } while(n>0);

        System.out.print("Sum of digits: ");
        System.out.println(s);
    }
}
