//Write a Java program to find the maximum difference between two elements in a given array of integers such that the smaller element appears before the larger element.  

import java.util.*;

class diff{
    static void maxdiff(int[] a, int l){
        System.out.println("Original Array: " + Arrays.toString(a));

        int p = 0;
        int q = 0;
        int d = 0;

        for(int i=0; i<l; i++){
            for(int j=i+1; j<l; j++){
                if(Math.abs(a[i]-a[j])>d){
                    d = Math.abs(a[i]-a[j]);
                    p = i;
                    q = j;
                }
            }
        }

        System.out.println("Maximum difference: " + d);
        System.out.println("Pair: " + a[p] + ", " + a[q]);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int l = sc.nextInt();
        int[] a = new int[l];
        System.out.println("Enter array elements: ");

        for(int i=0; i<l; i++){ a[i] = sc.nextInt(); }

        maxdiff(a, l);
    }
}