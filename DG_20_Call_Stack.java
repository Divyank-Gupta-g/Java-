// The call stack is what a program uses to keep track of method calls.
// The call stack is made up of stack frames - one for each method call.

package com.scaler;

public class DG_20_Call_Stack {
    public static void main(String[] args) {
        int x = 0;
        System.out.println("Inside main(), x = " + x);
        first();
    }

    static void first() {
        int x = 10;
        System.out.println("Inside first(), x = " + x);
        second();
    }

    static void second() {
        int x = 20;
        System.out.println("Inside second(), x = " + x);
    }
}
