// It is a condensed form of if-else statement.

package com.scaler;

import java.util.Scanner;

public class DG_11_Ternary_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number = ");
        int n = sc.nextInt();

        String ans = n%2 == 0 ? "Even" : "Odd";

        System.out.println(ans);
    }
}
