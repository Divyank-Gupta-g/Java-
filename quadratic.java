//Write a Java program to solve quadratic equations (use if, else if and else). 

import java.util.*;

class quadratic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Standard quadratic equation: a(x^2) + bx + c=0");
        System.out.println("Enter the values of a, b and c:");
        System.out.print("a = " );
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.print("c = ");
        int c = sc.nextInt();

        int d = ((b*b) - (4*a*c));
        double e = Math.sqrt(d);
        double f = (-b+e)/(2*a);
        double h = (-b-e)/(2*a);

        if (d<0) {
            System.out.println("Roots are imaginary: " +f +" and " +h);
        }
        else if (d==0) {
            System.out.println("Roots are real and  equal: " +f +" and " +h);
        }
        else {
            System.out.println("Roots are real and distinct: " +f +" and " +h);
        }
    }
}