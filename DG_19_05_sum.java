package com.scaler;

import java.util.Scanner;

public class DG_19_05_sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();

        System.out.println("Sum: " + printSum(a, b));
    }

    public static int printSum(int x, int y){
        return (x+y);
    }
}
