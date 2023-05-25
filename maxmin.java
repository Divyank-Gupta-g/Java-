//Write a Java program to find the maximum and minimum value of an array.

import java.util.*;

class maxmin{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int l = sc.nextInt();
        int[] a = new int[l];

        System.out.println("Enter the elements in array: ");
        for(int i=0; i<l; i++){ a[i] = sc.nextInt(); }

        int max = a[0];

        for(int i=1; i<l; i++){
            if(a[i]>max){ max = a[i]; }
        }

        int min = a[0];

        for(int i=1; i<l; i++){
            if(a[i]<min){ min = a[i]; }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}