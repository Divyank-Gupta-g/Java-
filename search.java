//Write a Java program to test if an array contains a specific value.

import java.util.*;

class search{
    public static boolean contain(int[] a,int n){
        for(int i : a){ 
            if(n==i){ return true; }
        }
        return false;
    }
      

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = {1, 5, 3, 2, 7, 6, 8};

        System.out.print("Enter the number you want to search in array: ");
        int n = sc.nextInt();

        System.out.println(contain(a, n));
    }
}