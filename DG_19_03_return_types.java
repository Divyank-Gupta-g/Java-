// Java methods also optionally return some value back to the caller using the return statement.
// The return type must be specified in the method signature
// The return type can be any valid data type in Java.
// In case no value needs to be returned, specify the return type as void.

package com.scaler;

import java.util.Scanner;

public class DG_19_03_return_types {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.print("Square of number = ");
        System.out.println(square(n));

        String[] arr = heroes();
        for(String hero : arr) {
            System.out.println(hero);
        }
    }
    static int square(int n) {              // int return type.
        return n*n;
    }

    static String[] heroes() {
        String[] superheroes = {"Ironman", "Spiderman"};
        return superheroes;
    }
}
