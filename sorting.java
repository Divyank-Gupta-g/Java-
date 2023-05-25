//Write a Java program to sort a numeric array and a string array.

import java.util.*;

class sorting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        String arr2[] = new String[n];

        System.out.println("Enter numeric elements in array1: ");
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter String elements in array2: ");
        for(int i=0; i<n; i++){ arr2[i] = sc.next(); }

        System.out.println("Original number array: " + Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("Sorted number array: " + Arrays.toString(arr1));

        System.out.println("Original string array: " + Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("Sorted String array: " + Arrays.toString(arr2));
    }
}