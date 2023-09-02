package com.company;

import java.util.Scanner;

public class DG_13_While_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit: ");
        int n = sc.nextInt();
        int i = 0;

        while (i<=n) {
            System.out.println(i);
            i++;
        }
    }
}
