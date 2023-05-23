//Write a Java program to find the number of days in a month.

import java.util.*;

public class days{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of month: ");
        int n = sc.nextInt();
        System.out.print("Enter year: ");
        int y = sc.nextInt();

        if (n==1 || n==3 || n==5 || n==7 || n==8 || n==10 || n==12) {
            System.out.println("Number of days in the month: 31");
        }
        else if (n==2) {
            if(y%4==0 && y%100!=0 || y%400==0) {
                System.out.println("Number of days in the month: 29");
            }
            else {
                System.out.println("Number of days in the month: 28");
            }
        }
        else {
                System.out.println("Number of days in the month: 30");
            }
    }
}