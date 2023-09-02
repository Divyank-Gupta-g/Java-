package com.scaler;

import java.util.Scanner;

public class DG_24_02_2D_Arrays_iteration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        System.out.println("Enter array elements: ");

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array elements: ");

        for(int i=0; i<r; i++){
            System.out.println("elements in row " + i + ":");
            for(int j=0; j<c; j++) {
                System.out.println(a[i][j]);
            }
        }
    }
}
