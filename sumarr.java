//Write a Java program to sum values of an array.

import java.util.*;

class sumarr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Numer of elements in array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int s = 0;

        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt(); 
            s += a[i];
        }

        System.out.println("Array: " + Arrays.toString(a));
        System.out.println("Sum of all elements: " + s);
    }
}