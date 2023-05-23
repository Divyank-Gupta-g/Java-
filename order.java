//Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.

import java.util.*;

class order{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && b>c){ System.out.println("Numbers are in decreasing order"); }
        else if(a<b && b<c){ System.out.println("Numbers are in increasing order."); }
        else { System.out.println("Numbers are neither in increasing or decreasing order."); }
    }
}