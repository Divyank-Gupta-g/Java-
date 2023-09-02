package com.scaler;

import java.util.Scanner;

public class DG_09_Else_if_logical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of Triangle: ");
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.print("c = ");
        int c = sc.nextInt();

        if (a == b & b == c)       // AND operator returns true only if both are true.
            System.out.println("Equilateral Triangle.");
        else if (a == b | b == c | c == a)        // OR operator return true if any one or both are true.
            System.out.println("Isosceles Triangle");
        else if ((a>b & a>c & a<b+c) | (b>a & b>c & b<a+c) | (c>a & c>b & c<a+b))
            System.out.println("Scalene Triangle");
        else
            System.out.println("Not a valid triangle sides.");
    }
}

/* && is logical short circuit AND and behave like AND
    However it only evaluates the second expression if the first is true.
    it means if first is false it always return false. */
/* || is logical short circuit OR operator and behave like OR operator
* However it only evaluates the second expression if the first is false.
* it means if first is True it always return True without checking second.*/
