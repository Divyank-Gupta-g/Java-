package com.scaler;

import java.util.Scanner;

public class DG_10_1_Switch_vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter small letter character: ");
        char ch = sc.next().charAt(0);

        switch(ch) {
            case 'a','e','i','o','u','A','E','I','O','U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonent.");
        }
    }
}
