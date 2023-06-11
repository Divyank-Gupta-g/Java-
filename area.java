//Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.

import java.util.*;

class shape{
    public void getarea(){
        System.out.print("Area: ");
    }
}

class rectangle extends shape{
    double l;
    double b;

    rectangle(double l, double b){
        this.l = l;
        this.b = b;
    }

    public void getarea(){
        super.getarea();
        System.out.println(l*b);
    }
}

public class area{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Length: ");
        double l = sc.nextDouble();
        System.out.print("Breadth: ");
        double b = sc.nextDouble();

        rectangle r = new rectangle(l, b);

        r.getarea();
    }
}