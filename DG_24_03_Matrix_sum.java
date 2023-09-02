package com.scaler;

import java.util.Scanner;

public class DG_24_03_Matrix_sum {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        int[][] b = new int[r][c];
        int[][] s = new int[r][c];

        matrixRead(a);
        matrixRead(b);

        System.out.println("Sum of both matrices: ");

        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                s[i][j] = a[i][j] + b[i][j];
                System.out.println(s[i][j]);
            }
        }
    }

    static void matrixRead(int[][] mat) {
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat.length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }
}
