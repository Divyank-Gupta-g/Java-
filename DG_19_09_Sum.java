package com.scaler;

import java.util.*;
public class DG_19_09_Sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();

        System.out.println("Sum from 1 to " + n + ": " + calcSum(n));
    }

    public static int calcSum(int x){
        int s = 0;
        for(int i=1; i<=x; i++){
            s += i;
        }
        return s;
    }
}
