//Write a Java program to display the multiplication table of a given integer.

import java.util.*;

class table{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Multiplication table of " + n);

        for(int i=1; i<=10; i++) {
            System.out.println(n*i);
        }
    }
}