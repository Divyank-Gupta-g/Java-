//Write a Java program to make such a pattern like a right angle triangle with the number increased by 1.(Floyd's Triangle).

import java.util.*;

class numpattern3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        int inc = 0;


        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(i+inc + " ");
                inc++;
            }
            inc--;
            System.out.println();
        }
    }
}