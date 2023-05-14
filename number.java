//Write a Java program to get a number from the user and print whether it is positive or negative.


import java.util.*;

class number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if(n>=0) { System.out.println(n + " is a positive number"); }
        else { System.out.println(n + " is a negative number"); }
    }
}