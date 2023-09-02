package com.company;

import java.util.Scanner;

public class DG_14_do_while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int n = sc.nextInt();
        int i = 0;

        do {
            System.out.println(i);
            i++;
        }
        while (i<=n);
    }
}
