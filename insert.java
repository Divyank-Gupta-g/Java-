//Write a Java program to insert an element (specific position) into an array.

import java.util.*;

class insert{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int l = sc.nextInt();
        int[] a = new int[l];

        System.out.println("Enter array elements: ");
        for(int i=0; i<l; i++){ a[i] = sc.nextInt(); }

        System.out.println("Original Array: " + Arrays.toString(a));

        System.out.print("Enter the number you want to insert: ");
        int n = sc.nextInt();
        System.out.print("Enter the desired index number for insertion: ");
        int j = sc.nextInt();

        for(int i=l-1; i>j; i--){
            a[i] = a[i-1];
        }
        a[j] = n;

        System.out.println("New Array: " + Arrays.toString(a));
    }
}