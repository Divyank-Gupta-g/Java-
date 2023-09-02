package com.scaler;

public class DG_18_02_String_methods {
    public static void main(String[] args) {
        String s1 = "Jai Shree Krishna";

        System.out.println((s1));

        System.out.println(s1.indexOf('a'));      // return the index number of first occurence of character or string.
        System.out.println(s1.indexOf('s'));
        System.out.println(s1.indexOf("Shre"));
        System.out.println(s1.indexOf('b'));       // return (-1) if character or string is not present.

        System.out.println(s1.contains("Shree"));   // check a substring is present in string or not.

        System.out.println(s1.toLowerCase());       // convert all characters into lower case
        System.out.println(s1);
        System.out.println(s1.toUpperCase());       // convert all characters into upper case
        System.out.println(s1);

        String s2 = s1.replace("Krishna", "Ram");   // replace all the occurence of target.

        System.out.println(s1);
        System.out.println(s2);

        String s3 = s1.substring(10);       // Make substring (beginIndex, endIndex)
        System.out.println(s3);
        String s4 = s1.substring(0, 8);
        System.out.println(s4);

        System.out.println(s4 + s3);        // String concatenation.
        System.out.println(s4 + "e " + s3);

        int x = 11;                     // premetive data type autmatically type casted.
        System.out.println(s1 + x);
    }
}
