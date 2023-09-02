package com.Pattern;

import java.util.*;

public class Star_02_Hollow_rectangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows: ");
        int r = sc.nextInt();
        System.out.print("Columns: ");
        int c = sc.nextInt();

        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                if(i==1 || i==r || j==1 || j==c)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
