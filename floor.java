//Write a Java program to compute the floor division and floor modulus of the given dividend and divisor.

import java.util.*;

class floor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int a = sc.nextInt();
        System.out.print("Enter divisor: ");
        int b = sc.nextInt();

        System.out.println("Floor Division: " + Math.floorDiv(a, b));
        System.out.println("Floor modulus: " + Math.floorMod(a, b));
    }
}