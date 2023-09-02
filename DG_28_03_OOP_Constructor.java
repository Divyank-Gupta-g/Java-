// A Java constructor is special method that is called when an object is instantiated.
// It has the same name as the class itself and is invoked automatically at the time of object construction.


package com.scaler;

class Carss {
    String model = "TATA";                  // properties
    String color = "Black";
    int price = 100000;
    boolean islocked = false;

    Carss (String modelName, String colorName) {      // constructor have no any return type and can accept arguments
        model = modelName;
        color = colorName;
    }

    void drive() { System.out.println("zoom zoom zoom");}       // functionalities

    void lock() {
        islocked = true;
        System.out.println("Car is locked now");}

    void unlock() {
        islocked = false;
        System.out.println("Car is unlocked.");}
}

class DG_28_03_OOP_Constructor {
    public static void main(String[] args) {
        Carss c1 = new Carss("TATA", "Red");                     // objects of class car
        Carss c2 = new Carss("Honda", "White");

        System.out.println(c1.model);
        System.out.println(c2.color);
    }
}