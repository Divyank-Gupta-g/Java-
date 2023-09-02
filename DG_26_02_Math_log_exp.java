package com.scaler;

import java.sql.SQLOutput;

public class DG_26_02_Math_log_exp {
    public static void main(String[] args) {
        double E = Math.E;          // return value of exponent (e)
        System.out.println(E);

        double x = Math.log(E);     // value of log(e)
        System.out.println(x);

        double y = Math.log10(100);     // value of log(100) with base 10.
        System.out.println(y);

        double a = Math.pow(2, 3);      // print power
        System.out.println(a);

        double b = Math.sqrt(25);       // print square root
        System.out.println(b);
    }
}
