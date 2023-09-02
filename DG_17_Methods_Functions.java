package com.company;

public class DG_17_Methods_Functions {

    public static void printjava() {
        System.out.println("Hello Java.");          // function to print message
    }

    public static void name(String name) {
        System.out.println(name);                   // function to print desired string
    }

    public static void sum(int a, int b) {
        int s = a+b;                                // function to print sum of two numbers.
        System.out.println(s);
    }

    public static void main(String[] args) {
        printjava();
        name("Ram");
        printjava();
        name("Shyam");
        printjava();
        name("Krishna");
        sum(5, 7);
    }
}
