package com.scaler;

import java.util.*;

public class DG_19_06_factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();

        System.out.println("factorial: " + factorial(n));
    }

    public static int factorial(int x){
        if(x==0 || x==1){
            return 1;
        }
        else{
            return x*factorial(x-1);
        }
    }
}
