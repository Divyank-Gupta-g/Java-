//Write a program in Java to input 5 numbers from the keyboard and find their sum and average.

import java.util.*;

class sumav{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        System.out.println("Enter any " + n + " integers: ");
        int s = 0;
        int a[] = new int[n];

        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            s = s + a[i];
        }
        System.out.println("Sum: " + s);
        double av = s/n;
        System.out.println("Average: " + av);
    }
}