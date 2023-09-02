package com.scaler;

import java.math.BigInteger;
import java.util.Scanner;

public class DG_27_BigInt_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int x = sc.nextInt();

        BigInteger f = new BigInteger("1");

        for(int i=1; i<=x; i++) {
            BigInteger temp = new BigInteger(i + "");
            f = f.multiply(temp);
        }

        System.out.println("Factorial of " + x + " is: " + f);
    }
}
