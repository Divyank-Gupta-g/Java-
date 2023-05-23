//Write a Java program to display the first 10 natural numbers.

import java.util.*;

class numbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper limit: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) { System.out.println(i); }
    }
}