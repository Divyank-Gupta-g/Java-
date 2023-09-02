package com.scaler;

import java.util.*;

public class DG_19_08_Average {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        double a = sc.nextDouble();
        System.out.print("b: ");
        double b = sc.nextDouble();
        System.out.print("c: ");
        double c = sc.nextDouble();

        System.out.println("Average: " + average(a, b, c));
    }

    public static double average(double x, double y, double z){
        return (x+y+z)/3;
    }
}
