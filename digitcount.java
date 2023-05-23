//Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.

import java.util.*;

class digitcount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an positive integer number: ");
        int n = sc.nextInt();
        int c = 0;

        while(n>=1){
            n = n/10;
            c += 1;
        }
        System.out.println("Digits in entered number: " +c);
    }
}