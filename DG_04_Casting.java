// casting means conversion of one data type to another data type.
// Java automatically allow casting of small data type to large data type (Implicit Casting)
// in explicit casting we convert large data type into small data type without caring about the data.

package com.company;

public class DG_04_Casting {
    public static void main(String[] args) {
        // implicit casting
        double a = 100.00;
        double b = a + 18;      // int(18) of size is 4 is converted into double of size(8).
        System.out.println(b);

        // Explicit Casting
        int c = 100;
        int d = c + (int)18.0;      // convert double into int data type.
        int e = c + (int)18.99;
        System.out.println(d);
        System.out.println(e);
    }
}
