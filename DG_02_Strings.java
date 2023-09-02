package com.company;

public class DG_02_Strings {
    public static void main(String[] args) {
        // string concatenation
        String s1 = "Krishna";
        String s2 = "Sudama";
        String s3 = s1 + s2;
        System.out.println(s3);
        String s4 = s1 + " and " + s2;
        System.out.println(s4);

        System.out.println(s1.charAt(0));       // to find the char at particular index (zero based indexing)
        System.out.println(s1.length());        // length of string

        String s5 = s1.replace('a', ' ');   // replace a character in a string
        System.out.println(s5);
        System.out.println(s1);         // original string is not changed so, strings are immutable in Java.

        System.out.println(s1.substring(0, 6));     // substring of a string (last index is not included)
        System.out.println(s4.substring(0, 11));
    }
}
