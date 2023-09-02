package com.scaler;

import java.util.*;

public class DG_19_07_factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();

        factorial(n);
    }

    public static void factorial(int x){
        int f=1;
        if(x<0){
            System.out.println("Invalid number.");
            return;
        }
        else if(x==0){
            System.out.println("factorial: "+f);
            return;
        }
        else{
            for(int i=1; i<=x; i++){
                f *= i;
            }
            System.out.println("factorial: " + f);
            return;
        }
    }
}