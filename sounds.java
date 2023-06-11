//Write a Java program to create an abstract class Animal with an abstract method called sound(). Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method to make a specific sound for each animal.

import java.util.*;

abstract class Animal{
    public abstract void sound();
}

class Lion extends Animal{
    public void sound(){
        System.out.println("Lion roars.");
    }
}

class Tiger extends Animal{
    public void sound(){
        System.out.println("Tiger growls.");
    }
}

public class sounds{
    public static void main(String[] args){
        Lion l = new Lion();
        Tiger t = new Tiger();

        l.sound();
        t.sound();
    }
}