//Write a Java program to make such a pattern like a pyramid with a number that repeats in the same row.

import java.util.*;

class numpattern4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            for (int j=(n-i); j!=0; j--){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

        