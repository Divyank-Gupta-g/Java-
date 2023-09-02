package com.company;

public class DG_06_Operators {
    public static void main(String[] args) {
        // Arithmatic operators
        int a = 5;              // (=) assignment operator.
        int b = 7;
        int s = a + b;
        int d = a - b;
        int m = a * b;
        float div = (float)b / (float)a;
        int mod = a % b;
        int mod2 = b % a;
        System.out.println(s);
        System.out.println(d);
        System.out.println(m);
        System.out.println(div);
        System.out.println(mod);
        System.out.println(mod2);

        // Unary assignment operator
        System.out.println(a++);        // increase value by 1 after operation
        System.out.println(a);
        System.out.println(++a);        // increase value by 1 before operation.
        System.out.println(a);

        System.out.println(a--);        // decrease value by 1 after operation
        System.out.println(a);
        System.out.println(--a);        // decrease value by 1 before operation.
        System.out.println(a);
    }
}
