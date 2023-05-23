//Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places.

import java.util.*;

class compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        a = Math.round(a*1000);

        b = Math.round(b*1000);
        
        if (a==b) { System.out.println("Both are equal"); }
        else { System.out.println("Both are not equal."); }
    }
}
        