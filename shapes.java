//Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter of each shape.

import java.util.*;

abstract class shape{
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends shape{
    double r;

    public Circle(double r){ this.r = r; }

    double calculateArea(){
        return ((Math.PI)*r*r);
    }

    double calculatePerimeter(){
        return 2*(Math.PI)*r;
    }
}

class Triangle extends shape{
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double calculateArea(){
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    double calculatePerimeter(){
        return (a+b+c);
    }
}

public class shapes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius of circle: ");
        double r = sc.nextDouble();
        Circle cr = new Circle(r);

        System.out.print("Area of circle: ");
        System.out.println(cr.calculateArea());
        System.out.print("Perimeter of circle: ");
        System.out.println(cr.calculatePerimeter());

        System.out.print("Enter sides of triangle: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        Triangle t = new Triangle(a, b, c);

        System.out.print("Area of triangle: ");
        System.out.println(t.calculateArea());
        System.out.print("Perimeter of triangle: ");
        System.out.println(t.calculatePerimeter());
    }
}