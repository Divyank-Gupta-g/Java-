//Write a Java program to find duplicate values in an array of integer values.

import java.util.*;

class duplicate{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int l = sc.nextInt();
        int[] a = new int[l];

        System.out.println("Enter array elements: ");
        for(int i=0; i<l; i++){ a[i] = sc.nextInt(); }

        for(int i=0; i<l; i++){
            for(int j=i+1; j<l; j++){
                if(a[i]==a[j] && i!=j){
                    System.out.println("Duplicate element: " + a[i]);
                }
            }
        }
    }
}