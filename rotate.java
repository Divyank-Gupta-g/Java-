//Write a Java program to cyclically rotate a given array clockwise by one.  

import java.util.*;

class rotate{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int l = sc.nextInt();
        int[] a = new int[l];
        System.out.println("Enter array elements: ");

        for(int i=0; i<l; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(a));

        int last = a[l-1];

        for(int i= l-1; i>0; i--){
            a[i] = a[i-1];
        }
        a[0] = last;

        System.out.println("Rotated array: " + Arrays.toString(a));
    }
}