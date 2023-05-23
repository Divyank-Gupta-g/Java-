//Write a Java program to display n terms of natural numbers and their sum.

import java.util.*;

class numbersum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        int s = 0;

        for(int i=1; i<=n; i++) {
            System.out.println(i);
            s = s+i;
        }
        System.out.println("Sum: " + s);
    }
}