// Object Oriented Programming
// It deals with classes and objects
// Its aim is to implement real world entities (e.g. Objects, Classes, Abstraction, Inheritance, Polymorphism etc.)

// Class is a blueprint for the object.
// Object is an entity that has a state and some behaviour.
// Blueprint include properties and functionalities.

package com.scaler;

class Car {
    String model = "TATA";                  // properties
    String color = "Black";
    int price = 100000;
    boolean islocked = false;

    void drive() { System.out.println("zoom zoom zoom");}       // functionalities

    void lock() {
        islocked = true;
        System.out.println("Car is locked now");}

    void unlock() {
        islocked = false;
        System.out.println("Car is unlocked.");}
}

class DG_28_01_OOP_Classes {
    public static void main(String[] args) {
        Car c1 = new Car();                     // objects of class car
        Car c2 = new Car();

        System.out.println(c1.color);
        System.out.println(c2.model);

        c2.color = "Grey";
        System.out.println(c2.color);

        c1.drive();     // using . operator we can access class methods.

        c1.unlock();
        c2.lock();

        System.out.println(c1.islocked);
        System.out.println(c2.islocked);
    }
}
