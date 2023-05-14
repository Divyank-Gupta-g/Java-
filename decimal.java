//Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.

import java.util.*;

class decimal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double n = sc.nextDouble();
        double a = Math.abs(n);

        if (n<0) { System.out.println(n + " is a negative number."); }
        else if (n>0) {
            if (a<1) { System.out.println(n + " is small positive number."); }
            else if (a>1000000) { System.out.println(n + " is large positive number."); }
            else { System.out.println(n + " is a positive number."); }
        }
        else { System.out.println(n + ": zero."); }
    }
}