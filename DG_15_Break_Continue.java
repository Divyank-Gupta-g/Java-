package com.company;

import java.util.Scanner;

public class DG_15_Break_Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int n = sc.nextInt();
        int i = 0;

        while(true) {
            System.out.println(i);
            i++;
            if (i == 3) {
                i++;
                continue;
            }
            else if(i > n) {
                break;
            }
        }
    }
}
