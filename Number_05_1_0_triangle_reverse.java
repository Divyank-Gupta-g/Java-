package com.Pattern;

import java.util.*;

public class Number_05_1_0_triangle_reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("rows: ");
        int r = sc.nextInt();

        for(int i=r; i>=1; i--){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0)
                    System.out.print("1");
                else
                    System.out.print("0");
            }
            System.out.println();
        }
    }
}