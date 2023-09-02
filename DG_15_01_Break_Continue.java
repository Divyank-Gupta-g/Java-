package com.scaler;

import java.util.Scanner;

public class DG_15_01_Break_Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int n = sc.nextInt();

        for(int i = 0; i<=n; i++) {
            if (i==3)
                continue;
            else if (i==10)
                break;
            System.out.println(i);
        }
    }
}
