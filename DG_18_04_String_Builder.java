// Java string builder class is used to creat mutable string.

package com.scaler;

public class DG_18_04_String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("I like Programming"); // if no any string pass then create an empty string.
        System.out.println(sb);

        sb.append(" and coffee.");      // add in the last
        System.out.println(sb);

        sb.insert(18, ", gaming");      // add at specific index number.
        System.out.println(sb);

        sb.replace(2, 6, "love");   // replace
        System.out.println(sb);

        sb.delete(7, 20);                       // delete substring between specified index numbers.
        System.out.println(sb);

        String s = sb.toString();
        System.out.println(s);
    }
}
