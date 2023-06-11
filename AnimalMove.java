//Write a Java program to create a class called Animal with a method named move(). Create a subclass called Cheetah that overrides the move() method to run.

import java.util.*;

class Animal{
    public void move(){
        System.out.println("Animal is moving");
    }
}

class Cheetah extends Animal{
    public void move(){
        System.out.println("Cheetah is running.");
    }
}

public class AnimalMove{
    public static void main(String[] args){
        Animal a = new Animal();
        Cheetah c = new Cheetah();

        a.move();
        c.move();
    }
}