// String and Character Array both store and handle sequences of characters but they are different in properties.
// Strings are immutable while array are mutable.
/* String is a sequence of chars represented as single data type while
char arrays are sequential collection of char data type. */
// String offers several builtin methods while char arrays have no builtin method.
// String stored in string pool while char array stored in heap.

package com.scaler;

public class DG_18_06_Str_ch_arr {
    public static void main(String[] args) {
        String str = "hello";
        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(str);
        System.out.println(arr);

        char[] arr1 = str.toCharArray();        // convert string into array
        System.out.println(arr1);

        String str1 = new String(arr);          // convert array into string
        System.out.println(str1);
    }
}
