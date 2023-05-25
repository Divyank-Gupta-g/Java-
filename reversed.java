//Write a Java program to reverse an array of integer values.

import java.util.*;

class reversed{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of string: ");
        int l = sc.nextInt();
        int[] a = new int[l];

        System.out.println("Enter array elements: ");
        for(int i=0; i<l; i++){ a[i] = sc.nextInt(); }

        System.out.println("Original array: " + Arrays.toString(a));

        int[] b = new int[l];

        for(int i=0; i<l; i++){
            b[i] = a[l-i-1];
        }

        System.out.println("Reversed array: " + Arrays.toString(b));
    }
}