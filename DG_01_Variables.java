package com.company;

public class DG_01_Variables {
    public static void main(String[] args){
        byte age = 25;                  // 1 byte [-128 to 127]
        int i = 51;                     // 4 byte
        long l = 135791157911L;         // L OR l for making long int data type.(compulsory) (8 byte)
        float f = 5.7f;                 // f or F for making float data type.(compulsory) (4 bytes)
        double d = 5.791D;              // D for making double data type.(not compulsory) (8 bytes)
        char ch= 'A';                   // 2 bytes
        boolean b = true;               // 1 byte
        String name = "Krishna";
        String friend = name;
        System.out.println(age);
        System.out.println(friend);
        System.out.println(name.length());     // length of string
    }
}
