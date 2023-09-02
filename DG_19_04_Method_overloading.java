//  Method overloading is the act of having multiple methods having same name but different parameters.
// It increases the readability of program.

package com.scaler;

public class DG_19_04_Method_overloading {
    static int add(int a, int b) {
        System.out.print("Inside first add: ");
        return a+b;
    }
                                                // the same add method operates differently
    static String add(String a, String b) {
        System.out.print("Inside second add: ");
        return a+b;
    }

    static String add(int a, String b) {
        System.out.print("Inside third add: ");
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 4));
        System.out.println(add("Shree ", "Krishna"));
        System.out.println(add(5, " Apples"));
    }
}
