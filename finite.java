// Write a Java program to test whether a given double/float value is a finite floating-point value or not.

import java.util.*;

class finite{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        float n = sc.nextFloat();

        boolean res = Float.isFinite(n);
        System.out.println("The number is finite: " +res);
    }
}