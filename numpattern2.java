//Write a program in Java to make such a pattern like a right angle triangle with a number which repeats a number in a row.

import java.util.*;

class numpattern2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(i);
            }
        System.out.println();
        }
    }
}