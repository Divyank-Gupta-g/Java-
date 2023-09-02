// Java wrapper class provide a mechanism to use primitive data types as objects.
// The name of all wrapper classes are the full name of respective primitive data type begin with the capital letter.

/* Autoboxing is the automatic conversion that the Java compiler makes between the primitive datatype
   and their corresponding object wrapper classes.*/

package com.scaler;

public class DG_25_Autoboxing_Unboxing {
    public static void main(String[] args) {
        int x = 5;
        float y = 3.14f;
        long z = 1234567;

        // autoboxing

        Integer intObj = x;
        Float floatObj = y;
        Long longObj = z;

        System.out.println(intObj);
        System.out.println(floatObj);
        System.out.println(longObj);

        // now we made the objects of these variables and we can access many actions by using (.) .

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.max(5,11));

        Integer n = 11;
        int nn = 11;

        // Unboxing

        Integer a = 100;
        Double b = 90.123456;
        Character c = 'e';

        int p = a;
        double q = b;
        char r = c;

        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
    }
}
