package com.company;

import java.util.Scanner;

public class DG_12_FOR_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        for(int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }
}
