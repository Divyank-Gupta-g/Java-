package com.scaler;

import java.math.BigInteger;

public class DG_27_02_BigInt_data_conversion {
    public static void main(String[] args) {
        int x = 50;
        BigInteger b = new BigInteger(x + "");      // when we add int with string
                                                        // then it convert integer value into string

        System.out.println(b);


        BigInteger b1 = new BigInteger("987654321012345");

        int y = b1.intValue();          // integer overflow
        System.out.println(y);

        long z = b1.longValue();
        System.out.println(z);
    }
}
