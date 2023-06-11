//Write a Java program to create an abstract class Animal with abstract methods eat() and sleep(). Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and sleep() methods differently based on their specific behavior.

import java.util.*;

abstract class Animal{
    abstract void eat();
    abstract void sleep();
}

class Lion extends Animal{
    void eat(){
        System.out.println("Lion eats meat.");
    }

    void sleep(){
        System.out.println("Lion sleeps on grassland.");
    }
}

class Tiger extends Animal{
    void eat(){
        System.out.println("Tiger eats meat and occasionally hunt in water.");
    }

    void sleep(){
        System.out.println("Tiger sleeps in a hidden place.");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("Deer grazes on grass.");
    }

    void sleep(){
        System.out.println("Deer sleeps in an open field.");
    }
}

public class animals{
    public static void main(String[] args){
        Lion l = new Lion();
        l.eat();
        l.sleep();

        Tiger t = new Tiger();
        t.eat();
        t.sleep();

        Deer d = new Deer();
        d.eat();
        d.sleep();
    }
}

