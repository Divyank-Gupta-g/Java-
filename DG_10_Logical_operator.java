package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DG_10_Logical_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of Triangle: ");
        System.out.println("a = ");
        int a = sc.nextInt();
        System.out.println("b = ");
        int b = sc.nextInt();
        System.out.println("c = ");
        int c = sc.nextInt();

        if (a == b && b == c)
            System.out.println("Equilateral Triangle.");
        else if (a == b || b == c || c == a)
            System.out.println("Isosceles Triangle");
        else
            System.out.println("Scalene Triangle");
    }
}
