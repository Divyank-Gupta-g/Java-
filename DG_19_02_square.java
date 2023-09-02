package com.scaler;

import java.util.Scanner;

public class DG_19_02_square {
    public static void main(String[] args) {
        square();
    }
    static void square() {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();

        System.out.print("Square of number = ");
        System.out.println(n*n);
    }
}
