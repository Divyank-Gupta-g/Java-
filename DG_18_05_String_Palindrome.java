package com.scaler;

import java.util.Scanner;

public class DG_18_05_String_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.next();

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();                               // generate reverse string.
        String rev = sb.toString();

        if(s.equals(rev)) {
            System.out.println("Yes, it is Palindrome.");
        }
        else {
            System.out.println("No, it is not Palindrome.");
        }
    }
}
