package com.company;

import java.util.Scanner;

public class DG_08_Input {
    public static void main(String[] args) {
        // take input
        Scanner sc = new Scanner(System.in);
        System.out.println("Number: ");
        int n = sc.nextInt();           // read integer value.
        System.out.println(n);
        System.out.println("Number2: ");
        float n1 = sc.nextFloat();
        System.out.println(n1);
        System.out.println("Sentence: ");
        String s = sc.next();               // read only the first word
        System.out.println(s);
        System.out.println("Sentence1: ");
        String s1 = sc.nextLine();         // read whole line.
        System.out.println(s1);
    }
}
