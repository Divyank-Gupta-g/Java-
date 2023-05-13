//Write a Java program to compare two signed and unsigned numbers.

import java.util.*;

class compare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two unsigned integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter two signed integers: ");
        int c = sc.nextInt();
        int d = sc.nextInt();

        int res1 = Integer.compareUnsigned(a, b);
        if(res1==0) {System.out.println(a + " and " + b + " are equal."); }
        else if (res1>0) { System.out.println(a + " is greater than " + b); }
        else {System.out.println(a + " is less than " + b); }

        int res2 = Integer.compare(c, d);
        if(res2==0) {System.out.println(c + " and " + d + " are equal."); }
        else if (res2>0) { System.out.println(c + " is greater than " + d); }
        else {System.out.println(c + " is less than " + d); }
    }
}