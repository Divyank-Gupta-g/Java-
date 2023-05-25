//Write a Java program to remove a specific element from an array.

import java.util.*;

class remove{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int l = sc.nextInt();
        int[] a = new int[l];

        System.out.println("Enter the elements of array: ");
        for(int i=0; i<l; i++){ a[i] = sc.nextInt(); }

        System.out.print("Enter the number you want to remove: ");
        int n = sc.nextInt();

        for(int i=0; i<l; i++){
            if(a[i]==n){ 
                for(int j=i; j<l-1; j++){ a[j] = a[j+1]; }
                break;
            }
        }

        for(int i=0; i<l-1; i++){
            System.out.print(a[i] + ", ");
        }
    }
}