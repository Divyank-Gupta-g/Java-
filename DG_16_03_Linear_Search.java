/* Given an array and key value as input, find the index of key in array.
* Return -1 if it is not present. */

package com.scaler;

import java.util.Scanner;

public class DG_16_03_Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements: ");

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the key value you want to search: ");
        int k = sc.nextInt();

        int r = -1;

        for(int i=0; i<n; i++) {
            if(arr[i] == k) {
                r = i;
                break;
            }
        }

        if(r==-1)
            System.out.println("The number is not found.");
        else
            System.out.print("The index number is: ");

        System.out.println(r);
    }
}
