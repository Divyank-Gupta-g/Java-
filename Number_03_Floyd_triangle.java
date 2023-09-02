package com.Pattern;

import java.util.*;
public class Number_03_Floyd_triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("rows: ");
        int r = sc.nextInt();
        int n = 1;

        for(int i=1; i<=r; i++){
            for(int j=1; j<=i; j++){
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
    }
}
