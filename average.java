//Write a Java program to calculate the average value of array elements.

import java.util.*;

class average{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        double s = 0;

        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++){ 
            a[i] = sc.nextInt(); 
            s += a[i];
        }

        System.out.println("Array: " + Arrays.toString(a));

        double av = s/n;

        System.out.println("Sum of elements: " + s);
        System.out.println("Average of elements: " + av);
    }
}