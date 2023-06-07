//Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.

import java.util.*;

class pairs{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = {1, 4, 5, 2, 3, 4, 2, 1};

        System.out.println("Array: " + Arrays.toString(a));

        System.out.print("Required sum: ");
        int n = sc.nextInt();

        System.out.println("Pairs whose sum is " + n + ":");

        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i] + a[j] == n){
                    System.out.println("Pair: " + a[i] + "\t" + a[j]);
                }
            }
        }
    }
}