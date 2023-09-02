package com.scaler;

import java.util.Scanner;

public class DG_51_Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("P : ");
        float p = sc.nextFloat();
        System.out.print("R : ");
        float r = sc.nextFloat();
        System.out.print("T : ");
        float t = sc.nextFloat();

        float si = (p*r*t)/100;

        System.out.println(si);
    }
}
