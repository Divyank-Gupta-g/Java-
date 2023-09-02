/*A variable is a container which stores value.
* Each variable has a type associated with it which is defined at its declaration.
* Java is strongly typed language so every variable needs to be declare before using it.
* Data type mean to identify the type of data and associate operations that can be done on the data value.
* Data type also tell the size of memory location and range of values that can store.
* 1 byte = 8 bits */

package com.scaler;

public class DG_02_Variables {
    public static void main(String[] args) {
        byte age = 25;                  // 1 byte [-128 to 127]
        int i = 51;                     // 4 byte
        long l = 135791157911L;         // L OR l for making long int data type.(compulsory) (8 byte)
        float f = 5.7f;                 // f or F for making float data type.(compulsory) (4 bytes)
        double d = 5.791D;              // D for making double data type.(not compulsory) (8 bytes)
        char ch= 'A';                   // 2 bytes
        boolean b = true;               // 1 byte
        short s = 5;                    // 2 bytes (-32768 to 32767)
        String name = "Krishna";
        String friend = name;
        System.out.println(age);
        System.out.println(friend);
        System.out.println(name.length());     // length of string
    }
}
