//Write a Java program to copy an array by iterating the array.

import java.util.*;

class copy{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int l = sc.nextInt();
        int[] a = new int[l];

        System.out.println("Enter array elements: ");
        for(int i=0; i<l; i++){ a[i] = sc.nextInt(); }

        System.out.println("Original array: " + Arrays.toString(a));

        int[] b = new int[l];

        for(int i=0; i<l; i++){ b[i] = a[i]; }

        System.out.println("Copied array: " + Arrays.toString(b));
    }
}