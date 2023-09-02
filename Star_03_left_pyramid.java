package com.Pattern;

import java.util.*;

public class Star_03_left_pyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows: ");
        int r = sc.nextInt();

        for(int i=1; i<=r; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
