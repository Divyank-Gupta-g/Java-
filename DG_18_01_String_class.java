// String class represents character string which is immutable.
// String pool is the area in the heap memory where string literals are stored.
// JVM allow java to save two variables of same value at same memory location and make it more efficient.

package com.scaler;

public class DG_18_01_String_class {
    public static void main(String[] args) {
        String s = "Jai Shree Krishna";
        System.out.println(s);
        System.out.println(s.length());             // length of string
        System.out.println(s.charAt(0));            // print character at specific index number (0 based indexing)
        System.out.println(s.charAt(4));

        String s1 = "abc";
        String s2 = "abc";

        if(s1==s2) {
            System.out.println("Equal");
        }
        else {
            System.out.println("Not equal.");
        }

        String s3 = new String("abc");          // new keyword make a new string outside the pool.

        if(s1==s3) {                                    // (==) checks the object refrences (memory location).
            System.out.println("Equal");
        }
        else {
            System.out.println("Not equal.");
        }

        if(s1.equals(s3)) {                             // compare the contents of the string.
            System.out.println("Equal");
        }
        else {
            System.out.println("Not equal.");
        }
    }
}
