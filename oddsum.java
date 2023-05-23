//Write a Java program that displays the sum of n odd natural numbers.

import java.util.*;

class oddsum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        int s = 0;

        for(int i=1; i<=n; i++) {
            if(i%2!=0) {
                System.out.println(i);
                s = s+i;
            }
        }
        System.out.println("Sum: " + s);
    }
}