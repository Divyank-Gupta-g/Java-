//Write a Java program to find the index of an array element.

import java.util.*;

class indexnum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int l = sc.nextInt();
        int[] a = new int[l];
        
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<l; i++){
            a[i] = sc.nextInt();
        }

        System.out.print("Enter the number you want to search: ");
        int n = sc.nextInt();

        for(int i=0; i<l; i++){
            if(a[i]==n){ 
                System.out.println("Index number of search: " + i);
                break;
            }
        }
    }
}