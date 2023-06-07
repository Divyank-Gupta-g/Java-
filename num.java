//Write a Java program to find the largest number from a given list of non-negative integers.  

import java.util.*;

class num{
    static void largest_num(int[] a, int l){
        System.out.println("Original array: " + Arrays.toString(a));

        Arrays.sort(a);

        for(int i=0; i<l/2; i++){
            int temp = a[i];
            a[i] = a[l-i-1];
            a[l-i-1] = temp;
        }
        System.out.print("Largest number: ");
        for(int ele : a){
            System.out.print(ele);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int l = sc.nextInt();
        int[] a = new int[l];
        System.out.println("Enter the elements in array: ");

        for(int i=0; i<l; i++){ a[i] = sc.nextInt(); }
        
        largest_num(a, l);
    }
}