//Write a Java program to find common elements between two integer arrays.

import java.util.*;

class commonint{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of first array: ");
        int l1 = sc.nextInt();
        int[] a = new int[l1];
        System.out.println("Enter first array elements: ");
        for(int i=0; i<l1; i++){ a[i] = sc.nextInt(); }

        System.out.print("Enter length of second array: ");
        int l2 = sc.nextInt();
        int[] b = new int[l2];
        System.out.println("Enter second array elements: ");
        for(int i=0; i<l2; i++){ b[i] = sc.nextInt(); }

        for(int i=0; i<l1; i++){
            for(int j=0; j<l2; j++){
                if(a[i]==b[j]){
                    System.out.println("Common element: " + a[i]);
                }
            }
        }
    }
}