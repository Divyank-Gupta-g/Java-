//Write a Java program that takes three numbers from the user and prints the greatest number.

import java.util.*;

class greatest {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a>b) {
            if (a>c) { System.out.println(a + " is the largest number"); }
            else { System.out.println(c + " is the largest number"); }
        }
        else {
            if (b>c) { System.out.println(b + " is the largest number"); }
            else { System.out.println(c + " is the largest number"); }
        }
    }
}