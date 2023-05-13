//Write a Java program to get the next floating-point adjacent to positive and negative infinity from a given floating/double number.

import java.util.*;

class adjacent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any floating number: ");
        float fn = sc.nextFloat();
        System.out.println("Next Down: " + Math.nextDown(fn));
        System.out.println("Next Up: " + Math.nextUp(fn));

        System.out.print("Enter any double number: ");
        double dn = sc.nextDouble();
        System.out.println("Next Down: " + Math.nextDown(dn));
        System.out.println("Next Up: " + Math.nextUp(dn));
    }
}