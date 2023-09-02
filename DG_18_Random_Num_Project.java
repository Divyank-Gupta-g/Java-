package com.company;

import java.util.Scanner;

public class DG_18_Random_Num_Project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = (int)(Math.random()*100);
        int u =0;

        do {
            System.out.print("Guess the number (1 to 100) : ");
            u = sc.nextInt();

            if (u == n) {
                System.out.println("Correct.");
                break;
            }
            else if (u > n) {
                System.out.println("Your number is large.");
            }
            else {
                System.out.println("Your number is small");
            }
        } while(u>=0);
        System.out.print("My number was : ");
        System.out.println(n);
    }
}
