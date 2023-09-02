// Java functions are known as methods.
// In Java, if a function is called through the object of a class then function is called method.
// Functions are block of code that are only executed when they are called.
// We can pass values to methods, known as parameters, and return values from them as well.
// Functions allow us to divide our code in logical blocks.
// They allow us to reuse code.

// Syntax: return_type function_name(parameters) { function body ; }

// Methods can accept values while being called.
// These values are stored in local variables known as parameters or arguments.
// A method can have multiple or none argument.
// The data type of each argument must be defined in the function signature.

package com.scaler;

public class DG_19_01_Functions {
    public static void main(String[] args) {
        String name = "Krishna";
        int age = 25;
        String[] hobbies = {"Singing", "Dancing"};
        intro(name, age, hobbies);
    }
    static void intro(String name, int age, String[] hobbies) {
        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old.");
        System.out.print("My hobbies are: ");
        for(String hobby : hobbies) {
            System.out.print(", " + hobby);
        }
    }
}
