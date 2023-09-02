package com.scaler;

import java.util.*;

public class DG_16_04_count {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of inputs: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter terms: ");

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int cp=0, cz=0, cn=0;

        for(int i=0; i<n; i++){
            if(a[i]<0)
                cn++;
            else if(a[i]==0)
                cz++;
            else
                cp++;
        }

        System.out.println("Number of positive terms: " + cp);
        System.out.println("Number of zero terms: " + cz);
        System.out.println("Number of negative terms: " + cn);
    }
}
