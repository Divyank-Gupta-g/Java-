//Write a Java program to create a class called Shape with methods called getPerimeter() and getArea(). Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the area and perimeter of a circle.

import java.util.*;

class shape{
    public double getPerimeter(){
        return 0.0;
    }

    public double getArea(){
        return 0.0;
    }
}

class circle extends shape{
    double r;

    public circle(double r){
        this.r = r;
    }

    public double getPerimeter(){
        return 2*Math.PI*r;
    }

    public double getArea(){
        return Math.PI*r*r;
    }
}

public class crcl{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius: ");
        double r = sc.nextDouble();
        circle c = new circle(r);

        System.out.println("Perimeter: " + c.getPerimeter());
        System.out.println("Area: " + c.getArea());
    }
}

    