// The Java math module provides the users with various methods relating to maths.

package com.scaler;

public class DG_26_01_Math_Module {
    public static void main(String[] args) {
        int max = Math.max(5, 11);          // we can use this method to compare two values of any premitive data type.
        int min = Math.min(5, 11);

        System.out.println(max);
        System.out.println(min);

        double a = Math.floor(5.1);         // gives nearest lower integer value.
        double b = Math.ceil(10.1);         // gives nearest upper integer value
        double c = Math.round(5.1);         // gives nearest integer value
        double d = Math.round(5.5);         // lower if number after decimal less than 5
        double e = Math.round(5.6);         // greater if number after decimal is either 5 or greater than 5.

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
