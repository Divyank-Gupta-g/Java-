//Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.

import java.util.*;

class Animal{
    public void makesound(){
        System.out.println("The animal make a sound.");
    }
}

class cat extends Animal{			//override
    public void makesound(){
        System.out.println("The cat quarrels.");
    }
}

public class animalsound{
    public static void main(String[] args){
        Animal a = new Animal();
        cat c = new cat();

        a.makesound();
        c.makesound();
    }
}