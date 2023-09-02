// The scope of variable is the the region of the program where it is accessible.
// There are two types scope levels in Java -
// 1. Class level scope
// 2. Block level scope

package com.scaler;

public class DG_21_Variable_Scope {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Initially, a = " + a);
        if (true) {
            a = 7;
            System.out.println("Inside the if, a = " + a);
        }
        System.out.println("Outside if, a = " + a);
    }
}
