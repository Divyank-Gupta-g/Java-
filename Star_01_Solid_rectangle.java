package com.Pattern;

import java.util.*;

public class Star_01_Solid_rectangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows: ");
        int r = sc.nextInt();
        System.out.print("Columns: ");
        int c = sc.nextInt();

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
