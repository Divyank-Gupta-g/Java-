package com.scaler;

import java.util.*;

public class DG_19_10_power {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();

        System.out.println(a + " to the power " + b + ": " + calculatePower(a, b));
    }

    static int calculatePower(int x, int y){
        int p = 1;
        for(int i=1; i<=y; i++){
            p *= x;
        }
        return p;
    }
}
