package com.scaler;

import java.math.BigInteger;        // to store and work with large integer values.

public class DG_27_01_BigInteger {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("1234567890");
        BigInteger b = new BigInteger("9876543210");

        BigInteger c = a.add(b);

        System.out.println(c);

        System.out.println(a.subtract(b));

        System.out.println(a.multiply(b));

        System.out.println(a.divide(b));

        System.out.println(a.mod(b));
    }
}
