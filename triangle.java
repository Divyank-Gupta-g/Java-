//Write a Java program to count the number of possible triangles from a given unsorted array of positive integers.  

import java.util.*;

class triangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int l = sc.nextInt();
        int[] a = new int[l];

        System.out.println("Enter array elements: ");

        for(int i=0; i<l; i++){
            a[i] = sc.nextInt();
        }

        int c = 0;

        for(int i=0; i<l-2; i++){
            for(int j=i+1; j<l-1; j++){
                for(int k=j+1; k<l; k++){
                    if(a[i]+a[j]>a[k]){ c++; }
                }
            }
        }
        System.out.println("Number of possible triangles: " + c);
    }
}