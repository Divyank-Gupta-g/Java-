package com.scaler;

import java.util.Scanner;

public class DG_08_If_else_leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("year =  ");
        int a = sc.nextInt();

        if (a % 4 == 0)
            if (a % 100 == 0)
                if (a % 400 == 0)
                    System.out.println("This is a leap year.");
                else
                    System.out.println("This is not a leap year.");
            else
                System.out.println("This is a leap year.");
        else
            System.out.println("This is not a leap year.");
    }
}
