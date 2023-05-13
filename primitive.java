//Write a Java program to extract the primitive type value from a given BigInteger value. 

import java.util.*;
import java.math.BigInteger;

class primitive{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter BigInteger value: ");
        BigInteger n = sc.nextBigInteger();

        System.out.println("Long value: " + n.longValue());
        System.out.println("Exact Long value: " + n.longValueExact());
        System.out.println("Integer value: " + n.intValue());
        System.out.println("Short value: " + n.shortValue());
        System.out.println("Byte value: " + n.byteValue());
    }
}