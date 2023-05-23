//Write a Java program that takes a year from the user and prints whether it is a leap year or not.

import java.util.*;

class leap{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int n = sc.nextInt();

        if(n%4==0 && n%100!=0 || n%400==0) {
            System.out.println("leap year.");
        }
        else { System.out.println("Not a leap year."); }
    }
}